package com.mukesh.mymovieapp.domain.usecase

import com.mukesh.mymovieapp.data.model.movie.Movie
import com.mukesh.mymovieapp.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}