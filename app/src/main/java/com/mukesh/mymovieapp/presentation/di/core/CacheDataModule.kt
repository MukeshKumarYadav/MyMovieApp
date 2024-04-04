package com.mukesh.mymovieapp.presentation.di.core

import com.mukesh.mymovieapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.mukesh.mymovieapp.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.mukesh.mymovieapp.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.mukesh.mymovieapp.data.repository.movie.datasource.MovieCacheDataSource
import com.mukesh.mymovieapp.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.mukesh.mymovieapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.mukesh.mymovieapp.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import com.mukesh.mymovieapp.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}