package com.ralf.daggerplugin.demo.component;

import com.ralf.daggerplugin.demo.activity.SubComponentDemoActivity;
import com.ralf.daggerplugin.demo.module.ChildModule;

import dagger.Subcomponent;

@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {

  void inject(SubComponentDemoActivity activity);

  // Subcomponent 需要 定义一个 Builder
  @Subcomponent.Builder
  interface Builder {
    ChildComponent build();
  }
}
