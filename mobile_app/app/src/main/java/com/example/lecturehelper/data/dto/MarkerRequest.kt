package com.example.lecturehelper.data.dto

data class MarkerRequest(
    val lectureId: String,
    val timestamp: Int,
    val type: String,
    val description: String
)