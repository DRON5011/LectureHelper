package com.example.lecturehelper.data.dto

data class LectureResponse(
    val id: String,
    val lection_name: String,
    val course_name: String,
    val lection_date: String,
    val start_time: String,
    val end_time: String,
    val transcript: String?,
    val summary: String?,
    val status: String,
    val created_at: String,
    val updated_at: String,
    val audioUrl: String?,
    val markers: List<String> = emptyList()
)