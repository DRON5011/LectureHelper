package com.example.lecturehelper.data.repository;

import com.example.lecturehelper.data.api.AuthApi;
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
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  private final Provider<AuthApi> authApiProvider;

  public AuthRepository_Factory(Provider<AuthApi> authApiProvider) {
    this.authApiProvider = authApiProvider;
  }

  @Override
  public AuthRepository get() {
    return newInstance(authApiProvider.get());
  }

  public static AuthRepository_Factory create(Provider<AuthApi> authApiProvider) {
    return new AuthRepository_Factory(authApiProvider);
  }

  public static AuthRepository newInstance(AuthApi authApi) {
    return new AuthRepository(authApi);
  }
}
