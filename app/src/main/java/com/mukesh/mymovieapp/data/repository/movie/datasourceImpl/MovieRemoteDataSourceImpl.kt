package com.mukesh.mymovieapp.data.repository.movie.datasourceImpl

import com.mukesh.mymovieapp.data.api.TMDBService
import com.mukesh.mymovieapp.data.model.movie.MovieList
import com.mukesh.mymovieapp.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

