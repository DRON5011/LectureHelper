package com.example.lecturehelper.domain.model

data class Summary(

    val lectureId: String,

    val shortSummary: String,

    val keyPoints: List<String>,

    val created_at: String
)