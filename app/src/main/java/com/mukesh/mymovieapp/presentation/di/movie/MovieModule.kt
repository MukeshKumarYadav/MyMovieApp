package com.mukesh.mymovieapp.presentation.di.movie

import com.mukesh.mymovieapp.domain.usecase.GetArtistsUseCase
import com.mukesh.mymovieapp.domain.usecase.GetMoviesUseCase
import com.mukesh.mymovieapp.domain.usecase.UpdateArtistsUseCase
import com.mukesh.mymovieapp.domain.usecase.UpdateMoviesUsecase
import com.mukesh.mymovieapp.presentation.artist.ArtistViewModelFactory
import com.mukesh.mymovieapp.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}