package com.mukesh.mymovieapp.data.repository.artist.datasource

import com.mukesh.mymovieapp.data.model.artist.Artist
import com.mukesh.mymovieapp.data.model.movie.Movie

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)

}