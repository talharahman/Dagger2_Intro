package com.example.pursuitdemoapp.mobile.ui;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class AndroidModule {

    private Application application;

    public AndroidModule(Application application) {
        this.application = application;
    }

    /*@Provides @App Context provideAppContext() {
        return application;
    }*/
}
