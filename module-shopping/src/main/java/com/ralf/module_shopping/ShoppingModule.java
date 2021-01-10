package com.ralf.module_shopping;

import javax.inject.Singleton;

import com.ralf.dagger_plugin.Plugin;
import com.ralf.dagger_plugin.shopping.ShoppingPlugin;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
public class ShoppingModule {

  @Singleton
  @Provides
  @IntoMap
  @ClassKey(ShoppingPlugin.class)
  static Plugin provideUserPlugin(ShoppingPluginImpl shoppingPlugin) {
    return shoppingPlugin;
  }
}
