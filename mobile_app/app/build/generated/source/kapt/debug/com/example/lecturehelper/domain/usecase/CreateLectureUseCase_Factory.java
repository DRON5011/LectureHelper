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
public final class CreateLectureUseCase_Factory implements Factory<CreateLectureUseCase> {
  private final Provider<LectureRepository> repositoryProvider;

  public CreateLectureUseCase_Factory(Provider<LectureRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CreateLectureUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static CreateLectureUseCase_Factory create(
      Provider<LectureRepository> repositoryProvider) {
    return new CreateLectureUseCase_Factory(repositoryProvider);
  }

  public static CreateLectureUseCase newInstance(LectureRepository repository) {
    return new CreateLectureUseCase(repository);
  }
}
