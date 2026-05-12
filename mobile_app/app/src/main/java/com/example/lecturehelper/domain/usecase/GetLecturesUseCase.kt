package com.example.lecturehelper.domain.usecase

import com.example.lecturehelper.data.repository.LectureRepository
import com.example.lecturehelper.domain.model.Lecture
import javax.inject.Inject

class GetLecturesUseCase @Inject constructor(

    private val repository: LectureRepository
) {

    suspend operator fun invoke(): List<Lecture> {

        return repository.getLectures()
    }
}