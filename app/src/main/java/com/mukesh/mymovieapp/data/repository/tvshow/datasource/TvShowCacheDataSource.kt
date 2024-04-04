package com.mukesh.mymovieapp.data.repository.tvshow.datasource

import com.mukesh.mymovieapp.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache(): List<TvShow>
    suspend fun saveTvShowsToCache(tvShows: List<TvShow>)

}