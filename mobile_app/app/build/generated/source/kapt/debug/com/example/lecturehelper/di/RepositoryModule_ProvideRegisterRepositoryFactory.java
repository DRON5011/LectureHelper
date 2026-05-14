package com.example.lecturehelper.di;

import com.example.lecturehelper.data.local.UserPreferences;
import com.example.lecturehelper.domain.repository.RegisterRepository;
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
public final class RepositoryModule_ProvideRegisterRepositoryFactory implements Factory<RegisterRepository> {
  private final Provider<UserPreferences> preferencesProvider;

  public RepositoryModule_ProvideRegisterRepositoryFactory(
      Provider<UserPreferences> preferencesProvider) {
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public RegisterRepository get() {
    return provideRegisterRepository(preferencesProvider.get());
  }

  public static RepositoryModule_ProvideRegisterRepositoryFactory create(
      Provider<UserPreferences> preferencesProvider) {
    return new RepositoryModule_ProvideRegisterRepositoryFactory(preferencesProvider);
  }

  public static RegisterRepository provideRegisterRepository(UserPreferences preferences) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideRegisterRepository(preferences));
  }
}
