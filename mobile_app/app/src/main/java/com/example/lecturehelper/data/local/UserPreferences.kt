package com.example.lecturehelper.data.local

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class UserPreferences @Inject constructor(
    @ApplicationContext private val context: Context
) {

    private val prefs =
        context.getSharedPreferences(
            "lecture_helper_prefs",
            Context.MODE_PRIVATE
        )

    fun saveUser(email: String) {

        prefs.edit()
            .putString("user_email", email)
            .apply()
    }

    fun getUser(): String? {

        return prefs.getString(
            "user_email",
            null
        )
    }

    fun clearUser() {

        prefs.edit()
            .clear()
            .apply()
    }
}