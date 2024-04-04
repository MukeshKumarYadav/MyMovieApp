package com.mukesh.mymovieapp.presentation

import android.app.Application
import com.mukesh.mymovieapp.BuildConfig
import com.mukesh.mymovieapp.presentation.di.Injector
import com.mukesh.mymovieapp.presentation.di.artist.ArtistSubComponent
import com.mukesh.mymovieapp.presentation.di.core.*
import com.mukesh.mymovieapp.presentation.di.movie.MovieSubComponent
import com.mukesh.mymovieapp.presentation.di.tvshow.TvShowSubComponent
import javax.inject.Inject

class App : Application(), Injector {
private lateinit var appComponent:AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
       return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }

}