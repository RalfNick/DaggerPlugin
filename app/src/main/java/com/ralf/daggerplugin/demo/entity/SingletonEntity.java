package com.ralf.daggerplugin.demo.entity;

import javax.inject.Inject;
import javax.inject.Singleton;

import androidx.annotation.NonNull;

@Singleton
public class SingletonEntity {

  @Inject
  public SingletonEntity() {
  }

  @NonNull
  @Override
  public String toString() {
    return SingletonEntity.class.getSimpleName() + hashCode();
  }
}
