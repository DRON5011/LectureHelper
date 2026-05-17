package com.example.lecturehelper.domain.repository

interface RegisterRepository {

    suspend fun register(
        email: String,
        password: String
    ): Result<Boolean>

    suspend fun login(
        email: String,
        password: String
    ): Result<Boolean>

    suspend fun logout()

    suspend fun isAuthorized(): Boolean
}
