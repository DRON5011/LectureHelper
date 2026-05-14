package com.example.lecturehelper.di;

import com.example.lecturehelper.data.api.MarkerApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideMarkerApiFactory implements Factory<MarkerApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideMarkerApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MarkerApi get() {
    return provideMarkerApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideMarkerApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideMarkerApiFactory(retrofitProvider);
  }

  public static MarkerApi provideMarkerApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideMarkerApi(retrofit));
  }
}
