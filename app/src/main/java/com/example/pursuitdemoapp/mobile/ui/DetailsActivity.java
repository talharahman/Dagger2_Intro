package com.example.pursuitdemoapp.mobile.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pursuitdemoapp.BuildConfig;
import com.example.pursuitdemoapp.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pursuitdemoapp.api.MovieService;
import com.example.pursuitdemoapp.model.MovieDetails;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailsActivity extends AppCompatActivity {
    private static final String MOVIE_BACKDROP_URL_PREFIX = "https://image.tmdb.org/t/p/w1280/";

    private ImageView imageView;
    private TextView titleView;
    private TextView releaseDateView;
    private TextView ratingView;
    private TextView overviewView;
    private ViewGroup reviews;
    private FloatingActionButton fab;
    private MovieService movieService;

    @Override
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.image);
        titleView = findViewById(R.id.title);
        releaseDateView = findViewById(R.id.release_date);
        ratingView = findViewById(R.id.rating);
        overviewView = findViewById(R.id.overview);
        reviews = findViewById(R.id.reviews);
        fab = findViewById(R.id.fab);

        Intent intent = getIntent();

        int movieId = intent.getIntExtra("movie_id", 0);
        System.out.println("movieId: " + movieId);

       // final int movieId = intent.getIntExtra("movie_id", 0);


  /*      Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        movieService = retrofit.create(MovieService.class);

        Call<MovieDetails> movieDetails =
                movieService.getMovieDetails(movieId, BuildConfig.MOVIE_DATABASE_API_KEY);
        movieDetails.enqueue(new Callback<MovieDetails>() {
            @Override public void onResponse(Call<MovieDetails> call, Response<MovieDetails> response) {
                if (response.isSuccessful()) {
                    MovieDetails details = response.body();

                    String backdropPath = MOVIE_BACKDROP_URL_PREFIX + details.backdrop_path;
                    Picasso.get().load(backdropPath).into(imageView);
                    titleView.setText(details.title);
                    releaseDateView.setText(details.release_date);
                    ratingView.setText(String.valueOf(details.vote_average));
                    overviewView.setText(details.overview);

                    loadExtraDetails(movieId);
                }
            }

            @Override public void onFailure(Call<MovieDetails> call, Throwable t) {
                Log.e("C4Q", "Error obtaining movie details", t);
            }
        });
    }

    private void loadExtraDetails(int movieId) {
        Call<ReviewResponse> reviewsCall =
                movieService.getReviews(movieId, BuildConfig.MOVIE_DATABASE_API_KEY);
        reviewsCall.enqueue(new Callback<ReviewResponse>() {
            @Override
            public void onResponse(Call<ReviewResponse> call, Response<ReviewResponse> response) {
                if (response.isSuccessful()) {
                    ReviewResponse reviewResponse = response.body();
                    for (Review review : reviewResponse.results) {
                        TextView reviewView = new TextView(DetailsActivity.this);
                        reviewView.setText(review.content);
                        reviews.addView(reviewView);
                    }
                }
            }

            @Override public void onFailure(Call<ReviewResponse> call, Throwable t) {
                Log.e("C4Q", "Error obtaining movie reviews", t);
            }
        });
    }*/

    }
}