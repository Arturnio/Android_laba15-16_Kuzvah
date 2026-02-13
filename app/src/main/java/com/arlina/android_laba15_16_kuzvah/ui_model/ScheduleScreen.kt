package com.arlina.android_laba15_16_kuzvah.ui_model

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.Alignment
import com.arlina.android_laba15_16_kuzvah.data.ScheduleItem
import com.arlina.android_laba15_16_kuzvah.data.sampleSchedule
import com.arlina.android_laba15_16_kuzvah.data.sampleSubjects

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScheduleScreen(
    onScheduleDetailClick : (String) -> Unit,
    onNavigateBack: () -> Unit,
    onItemClick: (String) -> Unit,
    modifier: Modifier = Modifier
) { Scaffold(
    topBar = {
        TopAppBar(
            title = { Text("Расписание") },
            navigationIcon = {
                IconButton(onClick = onNavigateBack) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Назад"
                    )
                }
            }
        )
    }
){
        paddingValues ->
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(sampleSchedule) { schudle ->
            ScheduleCard(
                item = schudle,
                onClick = { onScheduleDetailClick(schudle.id) }
            )
        }
    }
}}


@Composable
fun ScheduleCard(
    item: ScheduleItem,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable ( onClick = onClick )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(item.name, style = MaterialTheme.typography.titleMedium)
            Text("День: ${item.day}", style = MaterialTheme.typography.bodyMedium)
            Text("Время: ${item.time}", style = MaterialTheme.typography.bodyMedium)
            Text("Кабинет: ${item.room}", style = MaterialTheme.typography.bodyMedium)
            Text("Преподаватель: ${item.professor}", style = MaterialTheme.typography.bodyMedium)
        }
    }
}