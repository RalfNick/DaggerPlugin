package com.ralf.daggerplugin.demo.module;

import javax.inject.Singleton;

import com.ralf.daggerplugin.demo.component.ChildComponent;
import com.ralf.daggerplugin.demo.entity.ParentEntity;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = ChildComponent.class)
public class ParentModule {

  @Singleton
  @Provides
  public ParentEntity provideParentEntity() {
    return new ParentEntity();
  }
}
