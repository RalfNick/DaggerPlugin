package com.ralf.dagger_plugin;

import java.util.HashMap;
import java.util.Map;

import android.util.Log;
import androidx.annotation.Nullable;

public class PluginManager {

  public static final String TAG = "PluginManager";

  private static final PluginManager INSTANCE = new PluginManager();

  private Map<Class<?>, Plugin> mPluginMaps = new HashMap<>();

  public static PluginManager getInstance() {
    return INSTANCE;
  }

  private PluginManager() {
    //no instance
  }

  @Nullable
  public <T extends Plugin> T getPlugin(Class<T> clazz) {
    if (mPluginMaps != null && !mPluginMaps.isEmpty()) {
      return (T) mPluginMaps.get(clazz);
    }
    return null;
  }

  public void addPlugin(Map<Class<?>, ? extends Plugin> pluginMaps) {
    if (pluginMaps == null || pluginMaps.isEmpty()) {
      return;
    }
    for (Map.Entry<Class<?>, ? extends Plugin> entry : pluginMaps.entrySet()) {
      if (!mPluginMaps.containsKey(entry.getKey())) {
        mPluginMaps.put(entry.getKey(), entry.getValue());
      }
    }
  }

  public void logPlugin() {
    if (mPluginMaps == null || mPluginMaps.isEmpty()) {
      Log.e(TAG, "plugin map is empty");
      return;
    }
    for (Map.Entry<Class<?>, ? extends Plugin> entry : mPluginMaps.entrySet()) {
      Log.e(TAG, "class is " + entry.getKey().getSimpleName() + " - value " + entry.getValue());
    }
  }

}
