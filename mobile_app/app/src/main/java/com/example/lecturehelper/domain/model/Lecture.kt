package com.example.lecturehelper.domain.model

data class Lecture(

    val id: String,

    val lection_name: String,

    val course_name: String,

    val lection_date: String,

    val start_time: String,

    val end_time: String,

    val created_at: String,

    val updated_at: String,

    val transcript: String?,

    val summary: String?,

    val audioUrl: String?,

    val status: LectureStatus,

    val markers: List<String>
)