package com.ralf.daggerplugin.demo.entity;

import androidx.annotation.NonNull;

public class SubEntity {

  private ParentEntity mParentEntity;

  public SubEntity(ParentEntity parentEntity) {
    this.mParentEntity = parentEntity;
  }

  @NonNull
  @Override
  public String toString() {
    return "SubEntity{" +
        "mParentEntity=" + mParentEntity +
        '}';
  }
}
