package com.ralf.daggerplugin.demo.entity;

import javax.inject.Inject;

public class MapEntity {

  private static int sCounter = 0;

  @Inject
  public MapEntity() {
  }

  @Override
  public String toString() {
    return MapEntity.class.getSimpleName() + " index=" + sCounter++;
  }
}
