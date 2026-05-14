package com.example.lecturehelper.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AiProcessingWorker_AssistedFactory_Impl implements AiProcessingWorker_AssistedFactory {
  private final AiProcessingWorker_Factory delegateFactory;

  AiProcessingWorker_AssistedFactory_Impl(AiProcessingWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AiProcessingWorker create(Context arg0, WorkerParameters arg1) {
    return delegateFactory.get(arg0, arg1);
  }

  public static Provider<AiProcessingWorker_AssistedFactory> create(
      AiProcessingWorker_Factory delegateFactory) {
    return InstanceFactory.create(new AiProcessingWorker_AssistedFactory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<AiProcessingWorker_AssistedFactory> createFactoryProvider(
      AiProcessingWorker_Factory delegateFactory) {
    return InstanceFactory.create(new AiProcessingWorker_AssistedFactory_Impl(delegateFactory));
  }
}
