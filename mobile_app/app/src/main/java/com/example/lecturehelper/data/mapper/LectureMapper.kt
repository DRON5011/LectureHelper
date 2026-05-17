package com.example.lecturehelper.data.mapper

import com.example.lecturehelper.data.dto.LectureResponse
import com.example.lecturehelper.domain.model.Lecture
import com.example.lecturehelper.domain.model.LectureStatus
import kotlin.String

object LectureMapper {

    fun map(dto: LectureResponse): Lecture {

        return Lecture(
            id = dto.id,
            lection_name = dto.lection_name,
            course_name = dto.course_name,
            lection_date = dto.lection_date,
            start_time = dto.start_time,
            end_time = dto.end_time,

            created_at = dto.created_at,
            updated_at = dto.updated_at,

            transcript = dto.transcript,
            summary = dto.summary,

            audioUrl = dto.audioUrl,

            status = LectureStatus.valueOf(dto.status),

            markers = dto.markers
        )
    }
}