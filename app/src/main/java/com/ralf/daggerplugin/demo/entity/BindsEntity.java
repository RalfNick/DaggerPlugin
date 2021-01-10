package com.ralf.daggerplugin.demo.entity;

import javax.inject.Inject;

/**
 * 通过 @Binds 注入
 */
public class BindsEntity {

  private static int sCounter = 0;
  private final String name;

  @Inject
  public BindsEntity() {
    name = BindsEntity.class.getSimpleName() + " index=" + sCounter++;
  }

  @Override
  public String toString() {
    return name;
  }
}
