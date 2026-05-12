package com.example.lecturehelper.domain.model

data class Marker(

    val id: String,

    val lectureId: String,

    val start_time: Time,

    val end_time: Time,

    val type: MarkerType,

    val short_name: String,

    val desc: String,

    val createdBy: String
)