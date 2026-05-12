package com.example.lecturehelper.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(

        navController = navController,

        startDestination = "login"
    ) {

        composable("login") {

            LoginScreen(navController)
        }

        composable("lectures") {

            LectureListScreen(navController)
        }

        composable(
            "lecture/{id}"
        ) { backStack ->

            val id =
                backStack.arguments?.getString("id")
                    ?: ""

            LectureDetailsScreen(
                lectureId = id
            )
        }
    }
}