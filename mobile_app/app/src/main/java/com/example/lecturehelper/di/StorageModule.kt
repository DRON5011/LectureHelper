package com.example.lecturehelper.di

import android.content.Context
import android.content.SharedPreferences
import com.example.lecturehelper.data.storage.TokenStorage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object StorageModule {

    private const val PREFS_NAME = "lecture_ai_prefs"

    @Provides
    @Singleton
    fun provideSharedPreferences(
        @ApplicationContext context: Context
    ): SharedPreferences {

        return context.getSharedPreferences(
            PREFS_NAME,
            Context.MODE_PRIVATE
        )
    }

    @Provides
    @Singleton
    fun provideTokenStorage(
        sharedPreferences: SharedPreferences
    ): TokenStorage {

        return TokenStorage(sharedPreferences)
    }
}