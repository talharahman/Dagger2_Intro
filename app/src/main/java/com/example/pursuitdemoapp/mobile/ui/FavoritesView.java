package com.example.pursuitdemoapp.mobile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.pursuitdemoapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FavoritesView extends FrameLayout {

    private RecyclerView favoritesRecyclerView;
    private TextView emptyView;

    public FavoritesView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override protected void onFinishInflate() {
        super.onFinishInflate();

        favoritesRecyclerView = findViewById(R.id.favorites);
        emptyView = findViewById(R.id.empty);

        favoritesRecyclerView.setLayoutManager(
                new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
    }

    @Override protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        favoritesRecyclerView.setVisibility(GONE);
        emptyView.setVisibility(VISIBLE);
    }
}
