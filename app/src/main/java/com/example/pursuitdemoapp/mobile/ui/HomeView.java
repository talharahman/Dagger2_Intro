package com.example.pursuitdemoapp.mobile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.example.pursuitdemoapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeView extends LinearLayout {

    private RecyclerView nowPlayingRecyclerView;
    private RecyclerView mostPopularRecyclerView;

    private MovieAdapter nowPlayingAdapter;
    private MovieAdapter mostPopularAdapter;

    public HomeView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override protected void onFinishInflate() {
        super.onFinishInflate();

        nowPlayingRecyclerView = findViewById(R.id.now_playing);
        mostPopularRecyclerView = findViewById(R.id.most_popular);

        nowPlayingRecyclerView.setLayoutManager(
                new LinearLayoutManager(getContext(), HORIZONTAL, false));
        nowPlayingAdapter = new MovieAdapter();
        nowPlayingRecyclerView.setAdapter(nowPlayingAdapter);

        mostPopularRecyclerView.setLayoutManager(
                new LinearLayoutManager(getContext(), HORIZONTAL, false));
        mostPopularAdapter = new MovieAdapter();
        mostPopularRecyclerView.setAdapter(mostPopularAdapter);
    }
}
