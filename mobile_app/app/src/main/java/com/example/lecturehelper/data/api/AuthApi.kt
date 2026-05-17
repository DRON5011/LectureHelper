package com.example.lecturehelper.data.api

import com.example.lecturehelper.data.dto.AuthResponse
import com.example.lecturehelper.data.dto.LoginRequest
import com.example.lecturehelper.data.dto.RegisterRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {

    @POST("auth/login")
    suspend fun login(
        @Body request: LoginRequest
    ): AuthResponse

    @POST("auth/register")
    suspend fun register(
        @Body request: RegisterRequest
    ): AuthResponse
}