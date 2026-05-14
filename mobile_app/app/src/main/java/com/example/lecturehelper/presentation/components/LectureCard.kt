package com.example.lecturehelper.presentation.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.example.lecturehelper.domain.model.Lecture

@Composable
fun LectureCard(

    lecture: Lecture,

    onClick: () -> Unit
) {

    Card(
        onClick = onClick
    ) {

        Text(
            text = lecture.lection_name
        )
    }
}