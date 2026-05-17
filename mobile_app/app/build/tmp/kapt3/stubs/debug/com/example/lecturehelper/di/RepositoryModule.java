package com.example.lecturehelper.di;

import android.content.Context;
import com.example.lecturehelper.data.api.AuthApi;
import com.example.lecturehelper.data.api.LectureApi;
import com.example.lecturehelper.data.api.MarkerApi;
import com.example.lecturehelper.data.repository.AuthRepository;
import com.example.lecturehelper.data.repository.LectureRepository;
import com.example.lecturehelper.data.repository.MarkerRepository;
import com.example.lecturehelper.data.repository.RegisterRepositoryImpl;
import com.example.lecturehelper.domain.repository.RegisterRepository;
import com.example.lecturehelper.data.local.UserPreferences;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/example/lecturehelper/di/RepositoryModule;", "", "()V", "provideAuthRepository", "Lcom/example/lecturehelper/data/repository/AuthRepository;", "authApi", "Lcom/example/lecturehelper/data/api/AuthApi;", "provideLectureRepository", "Lcom/example/lecturehelper/data/repository/LectureRepository;", "lectureApi", "Lcom/example/lecturehelper/data/api/LectureApi;", "provideMarkerRepository", "Lcom/example/lecturehelper/data/repository/MarkerRepository;", "markerApi", "Lcom/example/lecturehelper/data/api/MarkerApi;", "provideRegisterRepository", "Lcom/example/lecturehelper/domain/repository/RegisterRepository;", "preferences", "Lcom/example/lecturehelper/data/local/UserPreferences;", "provideUserPreferences", "context", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lecturehelper.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.lecturehelper.data.repository.LectureRepository provideLectureRepository(@org.jetbrains.annotations.NotNull()
    com.example.lecturehelper.data.api.LectureApi lectureApi) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.lecturehelper.data.repository.AuthRepository provideAuthRepository(@org.jetbrains.annotations.NotNull()
    com.example.lecturehelper.data.api.AuthApi authApi) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.lecturehelper.data.repository.MarkerRepository provideMarkerRepository(@org.jetbrains.annotations.NotNull()
    com.example.lecturehelper.data.api.MarkerApi markerApi) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.lecturehelper.data.local.UserPreferences provideUserPreferences(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.lecturehelper.domain.repository.RegisterRepository provideRegisterRepository(@org.jetbrains.annotations.NotNull()
    com.example.lecturehelper.data.local.UserPreferences preferences) {
        return null;
    }
}