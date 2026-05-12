package com.example.lecturehelper.domain.model

data class Lecture(

    val id: String,

    val lection_name: String,

    val course_name: String,

    val lection_date: Date,

    val start_time: Time,

    val end_time: Time,

    val created_at: String,

    val updated_at: String,

    val transcript: String?,

    val summary: String?,

    val audioUrl: String?,

    val status: LectureStatus,

    val markers: List<Marker>
)