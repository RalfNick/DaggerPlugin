package com.ralf.daggerplugin.demo.component;

import com.ralf.daggerplugin.demo.activity.MultiInjectActivity;
import com.ralf.daggerplugin.demo.module.MultiBindsModule;

import dagger.Component;

@Component(modules = MultiBindsModule.class,
    dependencies = {SetComponent.class, MapComponent.class})
public interface MultiBindsComponent {

  void inject(MultiInjectActivity activity);
}
