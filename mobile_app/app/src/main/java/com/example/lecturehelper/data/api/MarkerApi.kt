package com.example.lecturehelper.data.api

import com.example.lecturehelper.data.dto.MarkerRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface MarkerApi {

    @POST("markers")
    suspend fun createMarker(
        @Body request: MarkerRequest
    ): Response<Unit>
}