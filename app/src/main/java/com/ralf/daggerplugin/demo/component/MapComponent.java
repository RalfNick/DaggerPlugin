package com.ralf.daggerplugin.demo.component;

import java.util.Map;

import com.ralf.daggerplugin.demo.entity.MapEntity;
import com.ralf.daggerplugin.demo.entity.MapEntityType;
import com.ralf.daggerplugin.demo.module.MapModule;

import dagger.Component;

@Component(modules = MapModule.class)
public interface MapComponent {

  Map<String, Integer> provideSIMap();

  Map<String, String> provideSSMap();

  Map<MapEntityType, MapEntity> provideClassMap();

  @Component.Builder
  interface Builder {
    MapComponent build();
  }
}
