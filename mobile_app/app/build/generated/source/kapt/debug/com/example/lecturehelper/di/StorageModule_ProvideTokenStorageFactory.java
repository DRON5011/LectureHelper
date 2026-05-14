package com.example.lecturehelper.di;

import android.content.SharedPreferences;
import com.example.lecturehelper.data.storage.TokenStorage;
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
public final class StorageModule_ProvideTokenStorageFactory implements Factory<TokenStorage> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public StorageModule_ProvideTokenStorageFactory(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public TokenStorage get() {
    return provideTokenStorage(sharedPreferencesProvider.get());
  }

  public static StorageModule_ProvideTokenStorageFactory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new StorageModule_ProvideTokenStorageFactory(sharedPreferencesProvider);
  }

  public static TokenStorage provideTokenStorage(SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideTokenStorage(sharedPreferences));
  }
}
