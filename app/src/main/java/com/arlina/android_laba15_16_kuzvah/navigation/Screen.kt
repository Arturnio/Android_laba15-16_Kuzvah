package com.arlina.android_laba15_16_kuzvah.navigation

sealed class Screen(val route: String){
    object  Home: Screen("home")
    object Details: Screen("details/{subjectId}"){
        fun createRoute(subjectId: String) = "details/$subjectId"
    }
    object Profile: Screen("profile")
    object Settings: Screen("settings")
    object Schedule : Screen("schedule")
    object ScheduleDetails: Screen("scheduleDetail/{subjectId}"){
        fun createsRoute(subjectId: String) = "scheduleDetail/$subjectId"
    }
}