package com.ralf.module_shopping;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.ralf.dagger_plugin.PluginManager;
import com.ralf.dagger_plugin.user.UserPlugin;

public class ShoppingActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_shopping);

    UserPlugin plugin = PluginManager.getInstance().getPlugin(UserPlugin.class);
    if (plugin != null) {
      plugin.getUserInfo();
    }
  }
}