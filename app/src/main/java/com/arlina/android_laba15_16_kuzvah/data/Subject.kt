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

val sampleSubjects = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 31,
        currentGrade = "Хорошо",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose.Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
    ),
    Subject(
        id = "1",
        name = "Инструментальные средства разработки программного обеспечения",
        professor = "Леонтьев Д.А.",
        credits = 30,
        currentGrade = "Хорошо",
        description = "Разработка программного обеспечения с помощью C#. Изучение фулстек разработки, написание своего backend and frontend"
    ),

    Subject(
        id = "1",
        name = "Разработка програмнных модулей",
        professor = "Донскова Д.А.",
        credits = 10,
        currentGrade = "Плохо",
        description = "Написание программ на языке C#, изучение новых конструкций"
    ),
    Subject(
        id = "1",
        name = "математическое моделирование",
        professor = "Трошина О.В",
        credits = 10,
        currentGrade = "Плохо",
        description = "Изучение решение злп, углубленное мат моделировние"
    ),
    Subject(
        id = "1",
        name = "Физ культура",
        professor = "Магомедов С.К",
        credits = 50,
        currentGrade = "Хорошо",
        description = "Развитие общей физической силы"
    ),
    Subject(
        id = "1",
        name = "Английский язык",
        professor = "Пенькова О.В",
        credits = 20,
        currentGrade = "Удовлетворительно",
        description = "Изучение Английского языка с углубленным изучением профессиональных тем"
    ),
    Subject(
        id = "1",
        name = "Системное программирование",
        professor = "Токаев Т.И",
        credits = 10,
        currentGrade = "Плохо",
        description = "Написание самого сложного кода в мире на языке Rust"
    ),
    Subject(
        id = "1",
        name = "Менеджмент в профессиональной деятельности",
        professor = "Запорожская С.А",
        credits = 0,
        currentGrade = "Плохо",
        description = "Обучение как стать менеджером"
    ),
    Subject(
        id = "1",
        name = "Обеспечение качества функционирования компьютерных сетей",
        professor = "Ушакова М.А",
        credits = 10,
        currentGrade = "Плохо",
        description = "Обеспечение качества компьютерных систем"
    ),
    Subject(
        id = "1",
        name = "Управление проектами",
        professor = "Трошина О.В",
        credits = 10,
        currentGrade = "Плохо",
        description = "Обучения управления проектами"
    ),

    )