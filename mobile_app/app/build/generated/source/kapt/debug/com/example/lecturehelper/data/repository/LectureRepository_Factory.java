package com.example.lecturehelper.data.repository;

import com.example.lecturehelper.data.api.LectureApi;
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
public final class LectureRepository_Factory implements Factory<LectureRepository> {
  private final Provider<LectureApi> lectureApiProvider;

  public LectureRepository_Factory(Provider<LectureApi> lectureApiProvider) {
    this.lectureApiProvider = lectureApiProvider;
  }

  @Override
  public LectureRepository get() {
    return newInstance(lectureApiProvider.get());
  }

  public static LectureRepository_Factory create(Provider<LectureApi> lectureApiProvider) {
    return new LectureRepository_Factory(lectureApiProvider);
  }

  public static LectureRepository newInstance(LectureApi lectureApi) {
    return new LectureRepository(lectureApi);
  }
}
