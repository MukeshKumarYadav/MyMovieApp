package com.mukesh.mymovieapp.presentation.di.movie

import com.mukesh.mymovieapp.presentation.artist.ArtistActivity
import com.mukesh.mymovieapp.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():MovieSubComponent
    }

}

