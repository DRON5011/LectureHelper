package com.example.lecturehelper.presentation.auth

data class AuthUiState(

    val isLoading: Boolean = false,

    val token: String? = null,

    val error: String? = null
)