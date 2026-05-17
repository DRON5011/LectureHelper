package com.example.lecturehelper.data.repository

import com.example.lecturehelper.data.local.UserPreferences
import com.example.lecturehelper.domain.repository.RegisterRepository
import kotlinx.coroutines.delay
import javax.inject.Inject

class RegisterRepositoryImpl @Inject constructor(
    private val preferences: UserPreferences
) : RegisterRepository {

    override suspend fun register(
        email: String,
        password: String
    ): Result<Boolean> {

        return try {

            delay(1000)

            preferences.saveUser(email)

            Result.success(true)

        } catch (e: Exception) {

            Result.failure(e)
        }
    }

    override suspend fun login(
        email: String,
        password: String
    ): Result<Boolean> {

        return try {

            delay(1000)

            preferences.saveUser(email)

            Result.success(true)

        } catch (e: Exception) {

            Result.failure(e)
        }
    }

    override suspend fun logout() {

        preferences.clearUser()
    }

    override suspend fun isAuthorized(): Boolean {

        return preferences.getUser() != null
    }
}