package com.ralf.daggerplugin.demo.activity;

import javax.inject.Inject;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.ralf.daggerplugin.R;
import com.ralf.daggerplugin.demo.component.DaggerParentComponent;
import com.ralf.daggerplugin.demo.entity.SubEntity;

public class SubComponentDemoActivity extends AppCompatActivity {

  private static final String TAG = "SubComponentDemo";

  @Inject
  SubEntity mSubEntity;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub_component_demo);

    DaggerParentComponent.builder()
        .build()
        .childComponentBuilder()
        .build()
        .inject(this);
    Log.e(TAG, "onCreate: " + mSubEntity);
  }
}