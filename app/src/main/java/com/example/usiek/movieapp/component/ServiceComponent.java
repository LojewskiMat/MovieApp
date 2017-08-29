package com.example.usiek.movieapp.component;

import com.example.usiek.movieapp.MainActivity;
import com.example.usiek.movieapp.module.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by usiek on 07.07.2017.
 */

@Singleton
@Component(modules = ServiceModule.class)
public interface ServiceComponent {
    public void inject(MainActivity mainActivity);
}
