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
public final class AiProcessingWorker_Factory {
  private final Provider<LectureRepository> repositoryProvider;

  public AiProcessingWorker_Factory(Provider<LectureRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public AiProcessingWorker get(Context appContext, WorkerParameters params) {
    return newInstance(appContext, params, repositoryProvider.get());
  }

  public static AiProcessingWorker_Factory create(Provider<LectureRepository> repositoryProvider) {
    return new AiProcessingWorker_Factory(repositoryProvider);
  }

  public static AiProcessingWorker newInstance(Context appContext, WorkerParameters params,
      LectureRepository repository) {
    return new AiProcessingWorker(appContext, params, repository);
  }
}
