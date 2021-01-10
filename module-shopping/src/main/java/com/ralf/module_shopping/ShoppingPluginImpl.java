package com.ralf.module_shopping;

import javax.inject.Inject;
import javax.inject.Singleton;

import android.util.Log;

import com.ralf.dagger_plugin.shopping.ShoppingPlugin;

@Singleton
public class ShoppingPluginImpl implements ShoppingPlugin {

  @Inject
  public ShoppingPluginImpl() {

  }

  @Override
  public void getShopping() {
    Log.d("ShoppingPluginImpl", "getShopping");
  }
}
