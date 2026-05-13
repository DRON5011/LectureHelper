package com.example.lecturehelper.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import com.example.lecturehelper.presentation.auth.LoginScreen
import com.example.lecturehelper.presentation.auth.RegisterScreen
import com.example.lecturehelper.presentation.lecture.CreateLectureScreen
import com.example.lecturehelper.presentation.lecture.LectureDetailsScreen
import com.example.lecturehelper.presentation.lecture.LectureListScreen
import com.example.lecturehelper.presentation.recording.RecordingScreen
import com.example.lecturehelper.presentation.recording.RecordingViewModel

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(

        navController = navController,

        startDestination = "login"
    ) {

        // Авторизация

        composable("login") {

            LoginScreen(
                navController = navController
            )
        }

        composable("register") {

            RegisterScreen(

                onRegisterSuccess = {

                    navController.navigate("lectures") {

                        popUpTo("login") {
                            inclusive = true
                        }
                    }
                }
            )
        }

        // Список лекций

        composable("lectures") {

            LectureListScreen(
                navController = navController
            )
        }

        // Детали лекции

        composable(

            route = "lecture/{lectureId}",

            arguments = listOf(

                navArgument("lectureId") {

                    type = NavType.StringType
                }
            )

        ) { backStackEntry ->

            val lectureId =
                backStackEntry.arguments
                    ?.getString("lectureId")
                    ?: ""

            LectureDetailsScreen(
                lectureId = lectureId
            )
        }

        // Создание лекции

        composable("createLecture") {

            CreateLectureScreen(

                onLectureCreated = {

                    navController.navigate("lectures") {

                        popUpTo("lectures")
                    }
                }
            )
        }

        // Экран записи

        composable("recording") {

            val viewModel: RecordingViewModel =
                hiltViewModel()

            RecordingScreen(
                viewModel = viewModel
            )
        }
    }
}