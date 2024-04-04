package com.mukesh.mymovieapp.presentation.di.core

import com.mukesh.mymovieapp.data.repository.artist.ArtistRepositoryImpl
import com.mukesh.mymovieapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.mukesh.mymovieapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.mukesh.mymovieapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.mukesh.mymovieapp.data.repository.movie.MovieRepositoryImpl
import com.mukesh.mymovieapp.data.repository.movie.datasource.MovieCacheDataSource
import com.mukesh.mymovieapp.data.repository.movie.datasource.MovieLocalDataSource
import com.mukesh.mymovieapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.mukesh.mymovieapp.data.repository.tvshow.TvShowRepositoryImpl
import com.mukesh.mymovieapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.mukesh.mymovieapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.mukesh.mymovieapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.mukesh.mymovieapp.domain.repository.ArtistRepository
import com.mukesh.mymovieapp.domain.repository.MovieRepository
import com.mukesh.mymovieapp.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}