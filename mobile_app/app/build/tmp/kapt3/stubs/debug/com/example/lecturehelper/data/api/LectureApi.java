package com.example.lecturehelper.data.api;

import com.example.lecturehelper.data.dto.CreateLectureRequest;
import com.example.lecturehelper.domain.model.Lecture;
import okhttp3.MultipartBody;
import retrofit2.Response;
import retrofit2.http.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00a2\u0006\u0002\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/example/lecturehelper/data/api/LectureApi;", "", "createLecture", "Lcom/example/lecturehelper/domain/model/Lecture;", "request", "Lcom/example/lecturehelper/data/dto/CreateLectureRequest;", "(Lcom/example/lecturehelper/data/dto/CreateLectureRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLecture", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLectures", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadLectureAudio", "Lretrofit2/Response;", "", "file", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LectureApi {
    
    @retrofit2.http.GET(value = "lectures")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLectures(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lecturehelper.domain.model.Lecture>> $completion);
    
    @retrofit2.http.GET(value = "lectures/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLecture(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lecturehelper.domain.model.Lecture> $completion);
    
    @retrofit2.http.POST(value = "lectures")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createLecture(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.lecturehelper.data.dto.CreateLectureRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lecturehelper.domain.model.Lecture> $completion);
    
    @retrofit2.http.Multipart()
    @retrofit2.http.POST(value = "lectures/upload")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadLectureAudio(@retrofit2.http.Part()
    @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
}