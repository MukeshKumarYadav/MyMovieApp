package com.mukesh.mymovieapp.data.model.movie


import com.mukesh.mymovieapp.data.model.movie.Movie
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    val movies: List<Movie>
)