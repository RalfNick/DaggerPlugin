package com.ralf.daggerplugin;

import java.util.Map;

import android.app.Application;
import android.util.Log;

import com.ralf.dagger_plugin.Plugin;
import com.ralf.dagger_plugin.PluginManager;
import com.ralf.daggerplugin.plugin.DaggerPluginComponent;
import com.ralf.daggerplugin.plugin.PluginComponent;

public class MyApplication extends Application {

  public static final String TAG = "MyApplication";
  private static PluginComponent sPluginComponent;

  @Override
  public void onCreate() {
    super.onCreate();
    sPluginComponent = DaggerPluginComponent.create();
    PluginManager pluginManager = PluginManager.getInstance();
    pluginManager.addPlugin(sPluginComponent.getPlugins());
    pluginManager.logPlugin();

    // print plugin
    logPlugin();
  }

  public void logPlugin() {
    if (sPluginComponent == null) {
      return;
    }
    Map<Class<?>, Plugin> plugins = sPluginComponent.getPlugins();
    if (plugins == null || plugins.isEmpty()) {
      Log.e(TAG, "plugin map is empty");
      return;
    }
    for (Map.Entry<Class<?>, ? extends Plugin> entry : plugins.entrySet()) {
      Log.e(TAG, "class is " + entry.getKey().getSimpleName() + " - value " + entry.getValue());
    }
  }
}
