package com.ralf.daggerplugin.demo.component;

import java.util.Set;

import com.ralf.daggerplugin.demo.module.SetModule;

import dagger.Component;

@Component(modules = SetModule.class)
public interface SetComponent {

  Set<String> provideStringSet();
}
