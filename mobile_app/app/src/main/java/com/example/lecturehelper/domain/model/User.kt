package com.example.lecturehelper.domain.model

data class User(

    val id: String,

    val fio: String,

    val email: String,

    val role: UserRole
)