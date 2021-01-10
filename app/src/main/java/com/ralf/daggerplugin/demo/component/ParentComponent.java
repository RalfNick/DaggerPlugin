package com.ralf.daggerplugin.demo.component;

import javax.inject.Singleton;

import com.ralf.daggerplugin.demo.module.ParentModule;

import dagger.Component;

@Singleton
@Component(modules = ParentModule.class)
public interface ParentComponent {

  ChildComponent.Builder childComponentBuilder();
}
