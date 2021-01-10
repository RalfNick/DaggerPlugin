package com.ralf.daggerplugin.demo.module;

import java.util.Map;
import java.util.Set;
import javax.inject.Named;

import dagger.Module;
import dagger.multibindings.Multibinds;

@Module
public abstract class MultiBindsModule {

  @Multibinds
  abstract Set<Integer> provideIntegerSet();

  @Multibinds
  @Named("empty map")
  abstract Map<String, Integer> provideStringMap();
}
