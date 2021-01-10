package com.ralf.module_user;

import javax.inject.Singleton;

import com.ralf.dagger_plugin.Plugin;
import com.ralf.dagger_plugin.user.UserPlugin;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
public class UserModule {

  @Singleton
  @Provides
  @IntoMap
  @ClassKey(UserPlugin.class)
  static Plugin provideUserPlugin(UserPluginImpl userPlugin) {
    return userPlugin;
  }
}
