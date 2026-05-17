package com.example.lecturehelper.data.dto

data class CreateLectureRequest(
    val lection_name: String,
    val course_name: String,
    val lection_date: String,
    val start_time: String,
    val end_time: String,
    val status: String
)