package com.ralf.daggerplugin.demo.module;

import javax.inject.Named;

import androidx.annotation.NonNull;

import com.ralf.daggerplugin.demo.entity.BindsEntity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class BindsEntityModule {

  @Provides
  @Named("static provide BindsEntity")
  public static BindsEntity provideFirstEntity(@NonNull BindsEntity entity) {
    return entity;
  }


  @Binds
  @Named("Binds provide BindsEntity")
  public abstract BindsEntity provideSecondEntity(@NonNull BindsEntity entity);
}
