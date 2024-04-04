package com.mukesh.mymovieapp.presentation.di.tvshow

import com.mukesh.mymovieapp.domain.usecase.GetArtistsUseCase
import com.mukesh.mymovieapp.domain.usecase.GetTvShowsUseCase
import com.mukesh.mymovieapp.domain.usecase.UpdateArtistsUseCase
import com.mukesh.mymovieapp.domain.usecase.UpdateTvShowsUseCase
import com.mukesh.mymovieapp.presentation.artist.ArtistViewModelFactory
import com.mukesh.mymovieapp.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}