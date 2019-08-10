package com.example.pursuitdemoapp.mobile.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.pursuitdemoapp.R;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pursuitdemoapp.model.Movie;

import java.util.Collections;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    private final int resourceId;

    List<Movie> movieList = Collections.emptyList();

    public MovieAdapter(@LayoutRes int resourceId) {
        this.resourceId = resourceId;
    }

    void setData(List<Movie> nowPlaying) {
        this.movieList = nowPlaying;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new MovieViewHolder(inflater.inflate(resourceId, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.bind(movieList.get(position));
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
