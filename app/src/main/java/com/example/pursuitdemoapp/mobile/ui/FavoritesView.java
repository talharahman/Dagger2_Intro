package com.example.pursuitdemoapp.mobile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.pursuitdemoapp.R;
import com.example.pursuitdemoapp.db.FavoritesDatabaseHelper;
import com.example.pursuitdemoapp.model.Movie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FavoritesView extends FrameLayout {

    private RecyclerView favoritesRecyclerView;
    private TextView emptyView;
    private MovieAdapter favoritesAdapter;

    public FavoritesView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override protected void onFinishInflate() {
        super.onFinishInflate();

        favoritesRecyclerView = findViewById(R.id.favorites);
        emptyView = findViewById(R.id.empty);

        favoritesRecyclerView.setLayoutManager(
                new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        favoritesAdapter = new MovieAdapter(R.layout.full_movie_list_item);
        favoritesRecyclerView.setAdapter(favoritesAdapter);
    }

    @Override protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        FavoritesDatabaseHelper databaseHelper = FavoritesDatabaseHelper.getInstance(getContext());
        List<Movie> favorites = databaseHelper.getFavorites();
        if (favorites.isEmpty()) {
            favoritesRecyclerView.setVisibility(GONE);
            emptyView.setVisibility(VISIBLE);
        } else {
            favoritesAdapter.setData(favorites);
        }
    }
}
