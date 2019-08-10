package com.example.pursuitdemoapp.model;

import androidx.annotation.NonNull;

public class Movie {
    public int id;
    public String poster_path;
    public String title;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", poster_path='" + poster_path + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
