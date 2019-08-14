package com.example.pursuitdemoapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.pursuitdemoapp.mobile.PursuitDemoApp;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.container) ViewGroup container;
    @BindView(R.id.bottom_navigation) BottomNavigationView bottomNavigationView;

    private View homeView;
    private View favoritesView;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater layoutInflater = getLayoutInflater();

        homeView = layoutInflater.inflate(R.layout.view_home, null);
        favoritesView = layoutInflater.inflate(R.layout.view_favorites, null);

        ButterKnife.bind(this);

        container.addView(homeView);
        toolbar.setTitle(R.string.home_title);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                menuItem -> {
                    // based on tab click, decide whether to show home or favorites view
                    switch (menuItem.getItemId()) {
                        case R.id.action_home:
                            container.removeAllViews();
                            container.addView(homeView);
                            toolbar.setTitle(R.string.home_title);
                            break;
                        case R.id.action_favorites:
                            container.removeAllViews();
                            container.addView(favoritesView);
                            toolbar.setTitle(R.string.favorites_title);
                            break;
                        default:
                            throw new IllegalStateException(
                                    "Unknown menu item id: " + getResources().getResourceName(menuItem.getItemId())
                            );
                    }

                    return true;
                });
    }
}
