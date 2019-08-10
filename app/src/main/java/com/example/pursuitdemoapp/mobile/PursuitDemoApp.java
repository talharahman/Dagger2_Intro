package com.example.pursuitdemoapp.mobile;

import android.app.Application;

public class PursuitDemoApp extends Application {

    private PursuitDemoAppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerPursuitDemoAppComponent.create();
    }

    public PursuitDemoAppComponent component() {
        return appComponent;
    }
}
