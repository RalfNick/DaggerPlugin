package com.ralf.daggerplugin.demo.module;

import com.ralf.daggerplugin.demo.entity.MapEntity;
import com.ralf.daggerplugin.demo.entity.MapEntityKey;
import com.ralf.daggerplugin.demo.entity.MapEntityType;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
@Module
public class MapModule {

  @Provides
  @IntoMap
  @StringKey("first")
  static Integer provideFirstInteger() {
    return 11;
  }

  @Provides
  @IntoMap
  @StringKey("second")
  static Integer provideSecondInteger() {
    return 22;
  }

  @Provides
  @IntoMap
  @StringKey("first")
  static String provideFirstString() {
    return "AA";
  }

  @Provides
  @IntoMap
  @StringKey("second")
  static String provideSecondString() {
    return "BB";
  }

  @Provides
  @IntoMap
  @MapEntityKey(MapEntityType.TYPE_A)
  static MapEntity provideFirstClass(MapEntity entity) {
    return entity;
  }

  @Provides
  @IntoMap
  @MapEntityKey(MapEntityType.TYPE_B)
  static MapEntity provideSecondClass(MapEntity entity) {
    return entity;
  }
}
