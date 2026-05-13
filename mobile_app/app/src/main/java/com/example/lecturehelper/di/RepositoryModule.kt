package com.example.lecturehelper.di

import android.content.Context
import com.example.lecturehelper.data.api.AuthApi
import com.example.lecturehelper.data.api.LectureApi
import com.example.lecturehelper.data.api.MarkerApi
import com.example.lecturehelper.data.repository.AuthRepository
import com.example.lecturehelper.data.repository.LectureRepository
import com.example.lecturehelper.data.repository.MarkerRepository
import com.example.lecturehelper.data.repository.RegisterRepositoryImpl
import com.example.lecturehelper.domain.repository.RegisterRepository
import com.example.lecturehelper.data.local.UserPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideLectureRepository(
        lectureApi: LectureApi
    ): LectureRepository {

        return LectureRepository(lectureApi)
    }

    @Provides
    @Singleton
    fun provideAuthRepository(
        authApi: AuthApi
    ): AuthRepository {

        return AuthRepository(authApi)
    }

    @Provides
    @Singleton
    fun provideMarkerRepository(
        markerApi: MarkerApi
    ): MarkerRepository {

        return MarkerRepository(markerApi)
    }

    @Provides
    @Singleton
    fun provideUserPreferences(
        @ApplicationContext context: Context
    ): UserPreferences {

        return UserPreferences(context)
    }

    @Provides
    @Singleton
    fun provideRegisterRepository(
        preferences: UserPreferences
    ): RegisterRepository {

        return RegisterRepositoryImpl(preferences)
    }
}