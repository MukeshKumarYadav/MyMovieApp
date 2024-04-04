package com.mukesh.mymovieapp.presentation.di.artist

import com.mukesh.mymovieapp.domain.usecase.GetArtistsUseCase
import com.mukesh.mymovieapp.domain.usecase.UpdateArtistsUseCase
import com.mukesh.mymovieapp.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}