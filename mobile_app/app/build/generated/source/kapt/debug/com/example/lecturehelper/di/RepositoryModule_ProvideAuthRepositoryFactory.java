package com.example.lecturehelper.di;

import com.example.lecturehelper.data.api.AuthApi;
import com.example.lecturehelper.data.repository.AuthRepository;
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
public final class RepositoryModule_ProvideAuthRepositoryFactory implements Factory<AuthRepository> {
  private final Provider<AuthApi> authApiProvider;

  public RepositoryModule_ProvideAuthRepositoryFactory(Provider<AuthApi> authApiProvider) {
    this.authApiProvider = authApiProvider;
  }

  @Override
  public AuthRepository get() {
    return provideAuthRepository(authApiProvider.get());
  }

  public static RepositoryModule_ProvideAuthRepositoryFactory create(
      Provider<AuthApi> authApiProvider) {
    return new RepositoryModule_ProvideAuthRepositoryFactory(authApiProvider);
  }

  public static AuthRepository provideAuthRepository(AuthApi authApi) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAuthRepository(authApi));
  }
}
