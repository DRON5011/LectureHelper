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
public final class GetLectureDetailsUseCase_Factory implements Factory<GetLectureDetailsUseCase> {
  private final Provider<LectureRepository> repositoryProvider;

  public GetLectureDetailsUseCase_Factory(Provider<LectureRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetLectureDetailsUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetLectureDetailsUseCase_Factory create(
      Provider<LectureRepository> repositoryProvider) {
    return new GetLectureDetailsUseCase_Factory(repositoryProvider);
  }

  public static GetLectureDetailsUseCase newInstance(LectureRepository repository) {
    return new GetLectureDetailsUseCase(repository);
  }
}
