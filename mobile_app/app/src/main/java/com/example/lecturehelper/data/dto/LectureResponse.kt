package com.example.lecturehelper.data.dto

data class LectureResponse(
    val id: String,
    val lection_name: String,
    val course_name: String,
    val lection_date: Date,
    val start_time: Time,
    val end_time: Time,
    val transcript: String?,
    val summary: String?,
    val status: String
)