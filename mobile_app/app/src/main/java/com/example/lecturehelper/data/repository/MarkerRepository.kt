package com.example.lecturehelper.data.repository

import com.example.lecturehelper.data.api.MarkerApi
import com.example.lecturehelper.data.dto.MarkerRequest
import javax.inject.Inject

class MarkerRepository @Inject constructor(
    private val markerApi: MarkerApi
) {

    suspend fun createMarker(
        request: MarkerRequest
    ) {

        markerApi.createMarker(request)
    }
}