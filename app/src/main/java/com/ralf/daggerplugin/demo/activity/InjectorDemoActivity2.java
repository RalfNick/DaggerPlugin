package com.ralf.daggerplugin.demo.activity;

import javax.inject.Inject;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.ralf.daggerplugin.R;
import com.ralf.daggerplugin.demo.component.DaggerEntityComponent;
import com.ralf.daggerplugin.demo.entity.SingletonEntity;

public class InjectorDemoActivity2 extends AppCompatActivity {

  public static final String TAG = "InjectorDemoActivity2";

  @Inject
  SingletonEntity mSingletonEntity;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_injector_actvity2);
    DaggerEntityComponent.builder()
        .build()
        .injectEntity(this);
    Log.e(TAG, mSingletonEntity.toString());
  }
}