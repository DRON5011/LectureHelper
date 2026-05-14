package com.example.lecturehelper.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.example.lecturehelper.data.repository.LectureRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class SyncWorker_Factory {
  private final Provider<LectureRepository> repositoryProvider;

  public SyncWorker_Factory(Provider<LectureRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public SyncWorker get(Context appContext, WorkerParameters params) {
    return newInstance(appContext, params, repositoryProvider.get());
  }

  public static SyncWorker_Factory create(Provider<LectureRepository> repositoryProvider) {
    return new SyncWorker_Factory(repositoryProvider);
  }

  public static SyncWorker newInstance(Context appContext, WorkerParameters params,
      LectureRepository repository) {
    return new SyncWorker(appContext, params, repository);
  }
}
