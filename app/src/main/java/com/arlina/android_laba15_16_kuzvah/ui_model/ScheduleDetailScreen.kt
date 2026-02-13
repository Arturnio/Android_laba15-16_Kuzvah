package com.arlina.android_laba15_16_kuzvah.ui_model

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.arlina.android_laba15_16_kuzvah.data.ScheduleItem
import com.arlina.android_laba15_16_kuzvah.data.sampleSchedule
import com.arlina.android_laba15_16_kuzvah.data.sampleSubjects


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScheduleDetailScreen(
    subjectId: String,
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    val subject = sampleSchedule.find { it.id == subjectId }
    if (subject == null) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = androidx.compose.ui.Alignment.Center
        ) {
            Text("Дисциплина не найдена")
        }
        return
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Детали занятия") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Default.ArrowBack,
                            contentDescription = "Назад")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Card(modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ){
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = subject.name,
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Преподаватель: ${subject.professor}",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = subject.day,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = subject.time,
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
//            Card(
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Column(
//                    modifier = Modifier.padding(16.dp)
//                ) {
//                    Text(
//                        text = "Описание курса",
//                        style = MaterialTheme.typography.titleMedium,
//                        fontWeight = FontWeight.Bold
//                    )
//                    Spacer(modifier = Modifier.height(8.dp))
//                    Text(
//                        text = subject.description,
//                        style = MaterialTheme.typography.bodyMedium,
//                        lineHeight = MaterialTheme.typography.bodyMedium.lineHeight.times(1.4f)
//                    )
//                }
//            }

        }
    }
}
