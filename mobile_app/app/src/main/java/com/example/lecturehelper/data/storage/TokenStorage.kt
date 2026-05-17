package com.example.lecturehelper.data.storage

import android.content.SharedPreferences

class TokenStorage(
    private val sharedPreferences: SharedPreferences
) {

    companion object {
        private const val KEY_TOKEN = "jwt_token"
    }

    fun saveToken(token: String) {

        sharedPreferences.edit()
            .putString(KEY_TOKEN, token)
            .apply()
    }

    fun getToken(): String? {

        return sharedPreferences.getString(
            KEY_TOKEN,
            null
        )
    }

    fun clearToken() {

        sharedPreferences.edit()
            .remove(KEY_TOKEN)
            .apply()
    }
}