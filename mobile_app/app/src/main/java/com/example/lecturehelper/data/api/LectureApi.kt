package com.example.lecturehelper.data.api

import com.example.lecturehelper.data.dto.CreateLectureRequest
import com.example.lecturehelper.domain.model.Lecture
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*

interface LectureApi {

    @GET("lectures")
    suspend fun getLectures(): List<Lecture>

    @GET("lectures/{id}")
    suspend fun getLecture(
        @Path("id") id: String
    ): Lecture

    @POST("lectures")
    suspend fun createLecture(
        @Body request: CreateLectureRequest
    ): Lecture

    @Multipart
    @POST("lectures/upload")
    suspend fun uploadLectureAudio(
        @Part file: MultipartBody.Part
    ): Response<Unit>
}