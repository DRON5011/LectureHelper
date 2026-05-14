package com.example.lecturehelper.domain.usecase;

import com.example.lecturehelper.data.repository.LectureRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class UploadLectureAudioUseCase_Factory implements Factory<UploadLectureAudioUseCase> {
  private final Provider<LectureRepository> repositoryProvider;

  public UploadLectureAudioUseCase_Factory(Provider<LectureRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public UploadLectureAudioUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static UploadLectureAudioUseCase_Factory create(
      Provider<LectureRepository> repositoryProvider) {
    return new UploadLectureAudioUseCase_Factory(repositoryProvider);
  }

  public static UploadLectureAudioUseCase newInstance(LectureRepository repository) {
    return new UploadLectureAudioUseCase(repository);
  }
}
