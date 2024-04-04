package com.mukesh.mymovieapp.domain.repository

import com.mukesh.mymovieapp.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?

}