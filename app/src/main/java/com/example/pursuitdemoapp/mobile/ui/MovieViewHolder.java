package com.example.pursuitdemoapp.mobile.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.pursuitdemoapp.R;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pursuitdemoapp.model.Movie;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    private static final String MOVIE_IMAGE_URL_PREFIX = "https://image.tmdb.org/t/p/w342/";

    @BindView(R.id.movie_image) ImageView image;
    @BindView(R.id.movie_title) TextView title;

    public MovieViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bind(final Movie movie) {
        String moviePosterUrl = MOVIE_IMAGE_URL_PREFIX + movie.poster_path;
        Picasso.get().load(moviePosterUrl).into(image);
        title.setText(movie.title);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Context context = itemView.getContext();

                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("movie_id", movie.id);
                intent.putExtra("poster_path", movie.poster_path);
                intent.putExtra("title", movie.title);
                context.startActivity(intent);
            }
        });
    }
}
