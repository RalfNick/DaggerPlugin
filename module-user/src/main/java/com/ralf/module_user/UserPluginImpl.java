package com.ralf.module_user;

import javax.inject.Inject;
import javax.inject.Singleton;

import android.util.Log;

import com.ralf.dagger_plugin.user.UserPlugin;

@Singleton
public class UserPluginImpl implements UserPlugin {

  @Inject
  public UserPluginImpl() {

  }

  @Override
  public void getUserInfo() {
    Log.d("UserPluginImpl", "getUserInfo");
  }
}
