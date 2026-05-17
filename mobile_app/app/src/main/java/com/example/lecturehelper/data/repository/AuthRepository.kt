package com.example.lecturehelper.data.repository

import com.example.lecturehelper.data.api.AuthApi
import com.example.lecturehelper.data.dto.LoginRequest
import com.example.lecturehelper.data.dto.RegisterRequest
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
                email = email,
                password = password
            )
        )

        return response.token
    }

    suspend fun register(
        fio: String,
        email: String,
        password: String
    ): String {

        val response = authApi.register(
            RegisterRequest(
                fio = fio,
                email = email,
                password = password
            )
        )

        return response.token
    }
}