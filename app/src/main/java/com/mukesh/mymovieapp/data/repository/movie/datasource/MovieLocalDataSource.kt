package com.mukesh.mymovieapp.data.repository.movie.datasource

import com.mukesh.mymovieapp.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}