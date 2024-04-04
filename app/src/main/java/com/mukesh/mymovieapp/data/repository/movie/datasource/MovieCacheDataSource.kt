package com.mukesh.mymovieapp.data.repository.movie.datasource

import com.mukesh.mymovieapp.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)

}