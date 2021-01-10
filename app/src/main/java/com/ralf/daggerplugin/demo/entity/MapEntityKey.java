package com.ralf.daggerplugin.demo.entity;

import dagger.MapKey;

@MapKey
public @interface MapEntityKey {
  MapEntityType value();
}
