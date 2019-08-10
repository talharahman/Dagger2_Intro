package com.example.pursuitdemoapp.model;

import androidx.annotation.NonNull;

public class Movie {
    public int id;
    public String poster_path;
    public String title;

    public static Movie from(int id, String posterPath, String title) {
        Movie movie = new Movie();
        movie.id = id;
        movie.poster_path = posterPath;
        movie.title = title;
        return movie;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", poster_path='" + poster_path + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
