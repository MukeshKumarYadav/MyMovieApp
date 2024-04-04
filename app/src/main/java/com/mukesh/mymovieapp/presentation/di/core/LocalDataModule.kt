package com.mukesh.mymovieapp.presentation.di.core

import com.mukesh.mymovieapp.data.db.ArtistDao
import com.mukesh.mymovieapp.data.db.MovieDao
import com.mukesh.mymovieapp.data.db.TvShowDao
import com.mukesh.mymovieapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.mukesh.mymovieapp.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.mukesh.mymovieapp.data.repository.movie.datasource.MovieLocalDataSource
import com.mukesh.mymovieapp.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.mukesh.mymovieapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.mukesh.mymovieapp.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }


}