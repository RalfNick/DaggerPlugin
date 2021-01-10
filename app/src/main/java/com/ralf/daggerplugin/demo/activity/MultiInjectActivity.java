package com.ralf.daggerplugin.demo.activity;

import java.util.Map;
import java.util.Set;
import javax.inject.Inject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.ralf.daggerplugin.R;
import com.ralf.daggerplugin.demo.component.DaggerMapComponent;
import com.ralf.daggerplugin.demo.component.DaggerMultiBindsComponent;
import com.ralf.daggerplugin.demo.component.DaggerSetComponent;
import com.ralf.daggerplugin.demo.entity.MapEntity;
import com.ralf.daggerplugin.demo.entity.MapEntityType;

public class MultiInjectActivity extends AppCompatActivity {

  public static final String TAG = "MultiInjectActivity";
  // MultiBinds
  @Inject
  Set<String> stringSet;
  @Inject
  Set<Integer> integerSet;

  @Inject
  Map<String, Integer> mSIMap;

  @Inject
  Map<String, String> mSSMap;

  @Inject
  Map<MapEntityType, MapEntity> mEntityMap;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_muiti_inject);

    inject();
    print();
  }

  private void inject() {
    DaggerMultiBindsComponent.builder()
        .setComponent(DaggerSetComponent.create())
        .mapComponent(DaggerMapComponent.builder().build())
        .build()
        .inject(this);
  }

  @SuppressLint("LogNotTimber")
  private void print() {
    Log.e(TAG, "string set size =  " + stringSet.size());
    for (String str : stringSet) {
      Log.e(TAG, "str = " + str);
    }
    Log.e(TAG, "string-integer map size =  " + mSIMap.size());
    for (Map.Entry<String, Integer> entry : mSIMap.entrySet()) {
      Log.e(TAG, "string-integer: key = " + entry.getKey() + " value = " + entry.getValue());
    }

    Log.e(TAG, "string-string map size =  " + mSSMap.size());
    for (Map.Entry<String, String> entry : mSSMap.entrySet()) {
      Log.e(TAG, "string-string: key = " + entry.getKey() + " value = " + entry.getValue());
    }

    Log.e(TAG, "string-class map size =  " + mEntityMap.size());
    for (Map.Entry<MapEntityType, MapEntity> entry : mEntityMap.entrySet()) {
      Log.e(TAG, "string-class: key = " + entry.getKey().toString()
          + " value = " + entry.getValue().toString());
    }
  }
}