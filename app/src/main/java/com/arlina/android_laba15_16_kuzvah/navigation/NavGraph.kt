package com.arlina.android_laba15_16_kuzvah.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.arlina.android_laba15_16_kuzvah.data.ScheduleItem
import com.arlina.android_laba15_16_kuzvah.data.sampleSchedule
import com.arlina.android_laba15_16_kuzvah.ui_model.*

@Composable
fun StudentPlannerNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(
                onSubjectClick = { subjectId ->
                    navController.navigate(Screen.Details.createRoute(subjectId))
                },
                onProfileClick = {
                    navController.navigate(Screen.Profile.route)
                },
                onSettingsClick = {
                    navController.navigate(Screen.Settings.route)
                },
                onScheduleClick = {
                    navController.navigate(Screen.Schedule.route)
                }
            )
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument("subjectId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val subjectId = backStackEntry.arguments?.getString("subjectId") ?: ""
            DetailsScreen(
                subjectId = subjectId,
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
        composable(route = Screen.Profile.route) {
            ProfileScreen(
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
        composable(route = Screen.Settings.route) {
            SettingsScreen(
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }

        composable(route = "schedule") {
            ScheduleScreen(
                onScheduleDetailClick =  { subjectId ->
                    navController.navigate(Screen.ScheduleDetails.createsRoute(subjectId))
                },
                onNavigateBack = { navController.popBackStack() },
                onItemClick = { item ->
                    navController.currentBackStackEntry?.savedStateHandle?.set("item", item)
                    navController.navigate("scheduleDetail")
                }
            )
        }
        composable(
            route = Screen.ScheduleDetails.route,
            arguments = listOf(
                navArgument("subjectId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val subjectId = backStackEntry.arguments?.getString("subjectId") ?: ""
            ScheduleDetailScreen(
                subjectId = subjectId,
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}