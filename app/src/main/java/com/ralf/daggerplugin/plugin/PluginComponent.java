package com.ralf.daggerplugin.plugin;

import java.util.Map;
import javax.inject.Singleton;

import com.ralf.dagger_plugin.Plugin;
import com.ralf.module_shopping.ShoppingModule;
import com.ralf.module_user.UserModule;

import dagger.Component;

@Singleton
@Component(modules = {UserModule.class, ShoppingModule.class})
public interface PluginComponent {

  Map<Class<?>, Plugin> getPlugins();
}
