package com.ralf.daggerplugin.demo.module;

import com.ralf.daggerplugin.demo.entity.ModuleEntity;

import dagger.Module;
import dagger.Provides;

@Module
public class EntityModule {

  @Provides
  public ModuleEntity provideEntity() {
    return new ModuleEntity();
  }
}
