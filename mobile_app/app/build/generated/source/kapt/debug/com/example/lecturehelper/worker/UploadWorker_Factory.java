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
public final class UploadWorker_Factory {
  private final Provider<LectureRepository> repositoryProvider;

  public UploadWorker_Factory(Provider<LectureRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public UploadWorker get(Context appContext, WorkerParameters params) {
    return newInstance(appContext, params, repositoryProvider.get());
  }

  public static UploadWorker_Factory create(Provider<LectureRepository> repositoryProvider) {
    return new UploadWorker_Factory(repositoryProvider);
  }

  public static UploadWorker newInstance(Context appContext, WorkerParameters params,
      LectureRepository repository) {
    return new UploadWorker(appContext, params, repository);
  }
}
