package com.example.lecturehelper.presentation.lecture

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.lecturehelper.presentation.components.LectureCard

@Composable
fun LectureListScreen(

    navController: NavController,

    viewModel: LectureViewModel =
        hiltViewModel()
) {

    val state by viewModel.state.collectAsState()

    LazyColumn {

        items(state.lectures) { lecture ->

            LectureCard(

                lecture = lecture,

                onClick = {

                    navController.navigate(
                        "lecture/${lecture.id}"
                    )
                }
            )
        }
    }
}