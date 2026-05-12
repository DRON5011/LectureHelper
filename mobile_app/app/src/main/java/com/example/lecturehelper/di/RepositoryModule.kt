package com.example.lecturehelper.di

import com.example.lecturehelper.data.api.AuthApi
import com.example.lecturehelper.data.api.LectureApi
import com.example.lecturehelper.data.api.MarkerApi
import com.example.lecturehelper.data.repository.AuthRepository
import com.example.lecturehelper.data.repository.LectureRepository
import com.example.lecturehelper.data.repository.MarkerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
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
}