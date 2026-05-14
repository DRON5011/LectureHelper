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
public final class GetLecturesUseCase_Factory implements Factory<GetLecturesUseCase> {
  private final Provider<LectureRepository> repositoryProvider;

  public GetLecturesUseCase_Factory(Provider<LectureRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetLecturesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetLecturesUseCase_Factory create(Provider<LectureRepository> repositoryProvider) {
    return new GetLecturesUseCase_Factory(repositoryProvider);
  }

  public static GetLecturesUseCase newInstance(LectureRepository repository) {
    return new GetLecturesUseCase(repository);
  }
}
