package com.example.pursuitdemoapp.mobile.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.pursuitdemoapp.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pursuitdemoapp.model.Movie;
import com.squareup.picasso.Picasso;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    private static final String MOVIE_IMAGE_URL_PREFIX = "https://image.tmdb.org/t/p/w342/";

    ImageView image;
    TextView title;

    public MovieViewHolder(View view) {
        super(view);
        image = view.findViewById(R.id.movie_image);
        title = view.findViewById(R.id.movie_title);
    }

    public void bind(Movie movie) {
        String moviePosterUrl = MOVIE_IMAGE_URL_PREFIX + movie.poster_path;
        Picasso.get().load(moviePosterUrl).into(image);
        title.setText(movie.title);
    }
}
