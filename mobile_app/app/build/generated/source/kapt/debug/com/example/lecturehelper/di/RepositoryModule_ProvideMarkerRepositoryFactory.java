package com.example.lecturehelper.di;

import com.example.lecturehelper.data.api.MarkerApi;
import com.example.lecturehelper.data.repository.MarkerRepository;
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
public final class RepositoryModule_ProvideMarkerRepositoryFactory implements Factory<MarkerRepository> {
  private final Provider<MarkerApi> markerApiProvider;

  public RepositoryModule_ProvideMarkerRepositoryFactory(Provider<MarkerApi> markerApiProvider) {
    this.markerApiProvider = markerApiProvider;
  }

  @Override
  public MarkerRepository get() {
    return provideMarkerRepository(markerApiProvider.get());
  }

  public static RepositoryModule_ProvideMarkerRepositoryFactory create(
      Provider<MarkerApi> markerApiProvider) {
    return new RepositoryModule_ProvideMarkerRepositoryFactory(markerApiProvider);
  }

  public static MarkerRepository provideMarkerRepository(MarkerApi markerApi) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideMarkerRepository(markerApi));
  }
}
