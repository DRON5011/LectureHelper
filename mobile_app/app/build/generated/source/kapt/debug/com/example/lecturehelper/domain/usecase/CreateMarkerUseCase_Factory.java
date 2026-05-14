package com.example.lecturehelper.domain.usecase;

import com.example.lecturehelper.data.repository.MarkerRepository;
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
public final class CreateMarkerUseCase_Factory implements Factory<CreateMarkerUseCase> {
  private final Provider<MarkerRepository> repositoryProvider;

  public CreateMarkerUseCase_Factory(Provider<MarkerRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CreateMarkerUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static CreateMarkerUseCase_Factory create(Provider<MarkerRepository> repositoryProvider) {
    return new CreateMarkerUseCase_Factory(repositoryProvider);
  }

  public static CreateMarkerUseCase newInstance(MarkerRepository repository) {
    return new CreateMarkerUseCase(repository);
  }
}
