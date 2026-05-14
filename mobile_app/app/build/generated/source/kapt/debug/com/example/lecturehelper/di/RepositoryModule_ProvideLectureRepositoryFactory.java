package com.example.lecturehelper.di;

import com.example.lecturehelper.data.api.LectureApi;
import com.example.lecturehelper.data.repository.LectureRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RepositoryModule_ProvideLectureRepositoryFactory implements Factory<LectureRepository> {
  private final Provider<LectureApi> lectureApiProvider;

  public RepositoryModule_ProvideLectureRepositoryFactory(Provider<LectureApi> lectureApiProvider) {
    this.lectureApiProvider = lectureApiProvider;
  }

  @Override
  public LectureRepository get() {
    return provideLectureRepository(lectureApiProvider.get());
  }

  public static RepositoryModule_ProvideLectureRepositoryFactory create(
      Provider<LectureApi> lectureApiProvider) {
    return new RepositoryModule_ProvideLectureRepositoryFactory(lectureApiProvider);
  }

  public static LectureRepository provideLectureRepository(LectureApi lectureApi) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideLectureRepository(lectureApi));
  }
}
