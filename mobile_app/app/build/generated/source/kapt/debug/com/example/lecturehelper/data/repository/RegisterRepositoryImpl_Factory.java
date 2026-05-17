package com.example.lecturehelper.data.repository;

import com.example.lecturehelper.data.local.UserPreferences;
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
public final class RegisterRepositoryImpl_Factory implements Factory<RegisterRepositoryImpl> {
  private final Provider<UserPreferences> preferencesProvider;

  public RegisterRepositoryImpl_Factory(Provider<UserPreferences> preferencesProvider) {
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public RegisterRepositoryImpl get() {
    return newInstance(preferencesProvider.get());
  }

  public static RegisterRepositoryImpl_Factory create(
      Provider<UserPreferences> preferencesProvider) {
    return new RegisterRepositoryImpl_Factory(preferencesProvider);
  }

  public static RegisterRepositoryImpl newInstance(UserPreferences preferences) {
    return new RegisterRepositoryImpl(preferences);
  }
}
