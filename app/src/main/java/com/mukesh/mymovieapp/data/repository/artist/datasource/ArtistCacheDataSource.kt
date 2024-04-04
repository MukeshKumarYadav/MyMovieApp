package com.mukesh.mymovieapp.data.repository.artist.datasource

import com.mukesh.mymovieapp.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(artists: List<Artist>)

}