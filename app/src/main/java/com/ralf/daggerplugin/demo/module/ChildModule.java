package com.ralf.daggerplugin.demo.module;

import com.ralf.daggerplugin.demo.entity.ParentEntity;
import com.ralf.daggerplugin.demo.entity.SubEntity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class ChildModule {

  @Provides
  public SubEntity provideEntity(ParentEntity entity){
    return new SubEntity(entity);
  }
}
