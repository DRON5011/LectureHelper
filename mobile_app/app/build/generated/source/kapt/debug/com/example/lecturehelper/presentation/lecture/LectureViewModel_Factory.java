package com.example.lecturehelper.presentation.lecture;

import com.example.lecturehelper.domain.usecase.GetLecturesUseCase;
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
public final class LectureViewModel_Factory implements Factory<LectureViewModel> {
  private final Provider<GetLecturesUseCase> getLecturesUseCaseProvider;

  public LectureViewModel_Factory(Provider<GetLecturesUseCase> getLecturesUseCaseProvider) {
    this.getLecturesUseCaseProvider = getLecturesUseCaseProvider;
  }

  @Override
  public LectureViewModel get() {
    return newInstance(getLecturesUseCaseProvider.get());
  }

  public static LectureViewModel_Factory create(
      Provider<GetLecturesUseCase> getLecturesUseCaseProvider) {
    return new LectureViewModel_Factory(getLecturesUseCaseProvider);
  }

  public static LectureViewModel newInstance(GetLecturesUseCase getLecturesUseCase) {
    return new LectureViewModel(getLecturesUseCase);
  }
}
