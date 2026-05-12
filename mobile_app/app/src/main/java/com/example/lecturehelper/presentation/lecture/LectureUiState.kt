package com.example.lecturehelper.presentation.lecture

import com.example.lecturehelper.domain.model.Lecture

data class LectureUiState(

    val lectures: List<Lecture> = emptyList(),

    val isLoading: Boolean = false,

    val error: String? = null
)