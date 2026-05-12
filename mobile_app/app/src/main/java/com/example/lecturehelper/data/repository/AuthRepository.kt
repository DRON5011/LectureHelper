package com.example.lecturehelper.data.repository

import com.example.lecturehelper.data.api.AuthApi
import com.example.lecturehelper.data.dto.LoginRequest
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val authApi: AuthApi
) {

    suspend fun login(
        email: String,
        password: String
    ): String {

        val response = authApi.login(
            LoginRequest(
                email,
                password
            )
        )

        return response.token
    }
}