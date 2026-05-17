package com.example.lecturehelper.domain.usecase

import com.example.lecturehelper.data.dto.MarkerRequest
import com.example.lecturehelper.data.repository.MarkerRepository
import javax.inject.Inject

class CreateMarkerUseCase @Inject constructor(

    private val repository: MarkerRepository
) {

    suspend operator fun invoke(
        request: MarkerRequest
    ) {

        repository.createMarker(request)
    }
}