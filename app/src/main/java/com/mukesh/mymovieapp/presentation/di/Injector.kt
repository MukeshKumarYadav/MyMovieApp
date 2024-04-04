package com.mukesh.mymovieapp.presentation.di

import com.mukesh.mymovieapp.presentation.di.artist.ArtistSubComponent
import com.mukesh.mymovieapp.presentation.di.movie.MovieSubComponent
import com.mukesh.mymovieapp.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}