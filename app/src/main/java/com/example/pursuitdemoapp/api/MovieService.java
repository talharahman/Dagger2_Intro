package com.example.pursuitdemoapp.api;

import com.example.pursuitdemoapp.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieService {

    String API_KEY = "8d30f27b9281b7f7375920bf57e34806";

    @GET("movie/now_playing")
    Call<MovieResponse> getNowPlayingMovies(@Query("api_key") String key);

    @GET("movie/popular")
    Call<MovieResponse> getPopularMovies(@Query("api_key") String key);
}
