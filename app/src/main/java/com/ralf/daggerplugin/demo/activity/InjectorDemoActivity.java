package com.ralf.daggerplugin.demo.activity;

import javax.inject.Inject;
import javax.inject.Named;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.ralf.daggerplugin.R;
import com.ralf.daggerplugin.demo.component.DaggerEntityComponent;
import com.ralf.daggerplugin.demo.entity.BindsEntity;
import com.ralf.daggerplugin.demo.entity.InjectEntity;
import com.ralf.daggerplugin.demo.entity.ModuleEntity;
import com.ralf.daggerplugin.demo.entity.SingletonEntity;

public class InjectorDemoActivity extends AppCompatActivity {

  public static final String TAG = "InjectorDemoActivity";

  @Inject
  InjectEntity mInjectEntity;
  @Inject
  SingletonEntity mSingletonEntity1;
  @Inject
  SingletonEntity mSingletonEntity2;
  @Inject
  ModuleEntity mModuleEntity;
  @Named("static provide BindsEntity")
  @Inject
  BindsEntity mBindsEntity1;
  @Named("Binds provide BindsEntity")
  @Inject
  BindsEntity mBindsEntity2;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_injector_demo);

    findViewById(R.id.button).setOnClickListener(v ->
        startActivity(new Intent(this, InjectorDemoActivity2.class)));
    findViewById(R.id.button_multi).setOnClickListener(v ->
        startActivity(new Intent(this, MultiInjectActivity.class)));

    DaggerEntityComponent.builder()
        .build()
        .injectEntity(this);
  }

  @SuppressLint("LogNotTimber")
  @Override
  protected void onResume() {
    super.onResume();
    // mInjectEntity
    Log.e(TAG, mInjectEntity.toString());
    // mModuleEntity和mSingletonEntity
    Log.e(TAG, mModuleEntity.toString());
    Log.e(TAG, mSingletonEntity1.toString());
    Log.e(TAG, mSingletonEntity2.toString());
    // mBindsEntity1 和 mBindsEntity2
    Log.e(TAG, mBindsEntity1.toString());
    Log.e(TAG, mBindsEntity2.toString());
  }
}