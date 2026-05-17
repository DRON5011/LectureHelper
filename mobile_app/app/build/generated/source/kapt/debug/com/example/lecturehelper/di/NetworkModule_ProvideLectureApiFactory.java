package com.example.lecturehelper.di;

import com.example.lecturehelper.data.api.LectureApi;
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
public final class NetworkModule_ProvideLectureApiFactory implements Factory<LectureApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideLectureApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public LectureApi get() {
    return provideLectureApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideLectureApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideLectureApiFactory(retrofitProvider);
  }

  public static LectureApi provideLectureApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideLectureApi(retrofit));
  }
}
