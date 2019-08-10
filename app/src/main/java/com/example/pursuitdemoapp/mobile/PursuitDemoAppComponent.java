package com.example.pursuitdemoapp.mobile;

import com.example.pursuitdemoapp.api.ApiModule;
import com.example.pursuitdemoapp.mobile.ui.DetailsActivity;
import com.example.pursuitdemoapp.mobile.ui.HomeView;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApiModule.class)

public interface PursuitDemoAppComponent {
    void inject(HomeView view);

    void inject(DetailsActivity activity);
}
