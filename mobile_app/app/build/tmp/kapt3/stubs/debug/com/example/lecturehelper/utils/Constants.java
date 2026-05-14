package com.example.lecturehelper.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/lecturehelper/utils/Constants;", "", "()V", "AUDIO_FILE_NAME", "", "BASE_URL", "MAX_AUDIO_SIZE_MB", "", "TOKEN_KEY", "WORK_SYNC", "WORK_UPLOAD", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://10.0.2.2:8000/api/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUDIO_FILE_NAME = "lecture_audio.mp4";
    public static final int MAX_AUDIO_SIZE_MB = 500;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_KEY = "jwt_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_UPLOAD = "upload_work";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_SYNC = "sync_work";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lecturehelper.utils.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}