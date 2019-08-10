package com.example.pursuitdemoapp.mobile.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.pursuitdemoapp.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pursuitdemoapp.model.Movie;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView title;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.movie_title);
        image = itemView.findViewById(R.id.movie_image);
    }

    public void bind(Movie movie) {

    }
}
