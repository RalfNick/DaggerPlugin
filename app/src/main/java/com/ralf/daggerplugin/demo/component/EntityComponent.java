package com.ralf.daggerplugin.demo.component;

import javax.inject.Singleton;

import com.ralf.daggerplugin.demo.activity.InjectorDemoActivity;
import com.ralf.daggerplugin.demo.activity.InjectorDemoActivity2;
import com.ralf.daggerplugin.demo.module.BindsEntityModule;
import com.ralf.daggerplugin.demo.module.EntityModule;

import dagger.Component;

@Singleton
@Component(modules = {EntityModule.class, BindsEntityModule.class})
public interface EntityComponent {

  void injectEntity(InjectorDemoActivity activity);

  void injectEntity(InjectorDemoActivity2 activity);
}
