package com.ralf.daggerplugin.demo.entity;

import javax.inject.Inject;

import androidx.annotation.NonNull;

/**
 * 通过 @Inject 注入
 */
public class InjectEntity {

  @Inject
  public InjectEntity() {
  }

  @NonNull
  @Override
  public String toString() {
    return InjectEntity.class.getSimpleName();
  }
}
