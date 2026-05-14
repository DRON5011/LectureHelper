package com.example.lecturehelper.data.repository;

import com.example.lecturehelper.data.api.MarkerApi;
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
public final class MarkerRepository_Factory implements Factory<MarkerRepository> {
  private final Provider<MarkerApi> markerApiProvider;

  public MarkerRepository_Factory(Provider<MarkerApi> markerApiProvider) {
    this.markerApiProvider = markerApiProvider;
  }

  @Override
  public MarkerRepository get() {
    return newInstance(markerApiProvider.get());
  }

  public static MarkerRepository_Factory create(Provider<MarkerApi> markerApiProvider) {
    return new MarkerRepository_Factory(markerApiProvider);
  }

  public static MarkerRepository newInstance(MarkerApi markerApi) {
    return new MarkerRepository(markerApi);
  }
}
