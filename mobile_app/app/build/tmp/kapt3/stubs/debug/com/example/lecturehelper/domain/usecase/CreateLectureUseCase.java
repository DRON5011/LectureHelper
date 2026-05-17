package com.example.lecturehelper.domain.usecase;

import com.example.lecturehelper.data.repository.LectureRepository;
import com.example.lecturehelper.domain.model.Lecture;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J>\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0086B\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/lecturehelper/domain/usecase/CreateLectureUseCase;", "", "repository", "Lcom/example/lecturehelper/data/repository/LectureRepository;", "(Lcom/example/lecturehelper/data/repository/LectureRepository;)V", "invoke", "Lcom/example/lecturehelper/domain/model/Lecture;", "lection_name", "", "course_name", "lection_date", "start_time", "end_time", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CreateLectureUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.lecturehelper.data.repository.LectureRepository repository = null;
    
    @javax.inject.Inject()
    public CreateLectureUseCase(@org.jetbrains.annotations.NotNull()
    com.example.lecturehelper.data.repository.LectureRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String lection_name, @org.jetbrains.annotations.NotNull()
    java.lang.String course_name, @org.jetbrains.annotations.NotNull()
    java.lang.String lection_date, @org.jetbrains.annotations.NotNull()
    java.lang.String start_time, @org.jetbrains.annotations.NotNull()
    java.lang.String end_time, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lecturehelper.domain.model.Lecture> $completion) {
        return null;
    }
}