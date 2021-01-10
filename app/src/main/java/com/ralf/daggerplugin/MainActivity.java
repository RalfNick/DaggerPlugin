package com.ralf.daggerplugin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ralf.daggerplugin.demo.activity.InjectorDemoActivity;
import com.ralf.daggerplugin.demo.activity.InjectorDemoActivity2;
import com.ralf.daggerplugin.demo.activity.MultiInjectActivity;
import com.ralf.daggerplugin.demo.activity.SubComponentDemoActivity;
import com.ralf.module_shopping.ShoppingActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewById(R.id.text_inject1).setOnClickListener(view -> {
      Intent intent = new Intent(MainActivity.this, InjectorDemoActivity.class);
      startActivity(intent);
    });

    findViewById(R.id.text_inject2).setOnClickListener(view -> {
      Intent intent = new Intent(MainActivity.this, InjectorDemoActivity2.class);
      startActivity(intent);
    });

    findViewById(R.id.text_multi_inject).setOnClickListener(view -> {
      Intent intent = new Intent(MainActivity.this, MultiInjectActivity.class);
      startActivity(intent);
    });

    findViewById(R.id.shopping).setOnClickListener(view -> {
      Intent intent = new Intent(MainActivity.this, ShoppingActivity.class);
      startActivity(intent);
    });

    findViewById(R.id.sub_component).setOnClickListener(view -> {
      Intent intent = new Intent(MainActivity.this, SubComponentDemoActivity.class);
      startActivity(intent);
    });
  }
}