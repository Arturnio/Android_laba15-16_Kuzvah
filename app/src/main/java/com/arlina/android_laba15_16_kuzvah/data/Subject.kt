package com.arlina.android_laba15_16_kuzvah.data

import androidx.compose.material3.Surface

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
)
val sampleSubjects= listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose.Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
    )
)