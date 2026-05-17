package com.example.lecturehelper.domain.usecase

import com.example.lecturehelper.data.repository.LectureRepository
import com.example.lecturehelper.domain.model.Lecture
import javax.inject.Inject

class GetLectureDetailsUseCase @Inject constructor(

    private val repository: LectureRepository
) {

    suspend operator fun invoke(
        id: String
    ): Lecture {

        return repository.getLecture(id)
    }
}