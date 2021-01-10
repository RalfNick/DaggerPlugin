package com.ralf.daggerplugin.demo.module;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class SetModule {

  @Provides
  @IntoSet
  static String provideAString() {
    return "A";
  }

  @Provides
  @IntoSet
  static String provideBString() {
    return "B";
  }
}
