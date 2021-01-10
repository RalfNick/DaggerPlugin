package com.ralf.daggerplugin.demo.entity;

/**
 * 通过 Module 方式注入
 */
public class ModuleEntity {

  private static int sCounter = 0;
  private final String name;

  public ModuleEntity() {
    name = ModuleEntity.class.getSimpleName() + " index=" + sCounter++;
  }

  @Override
  public String toString() {
    return name;
  }
}
