package com.mukesh.mymovieapp.data.repository.artist.datasource

import com.mukesh.mymovieapp.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB(): List<Artist>
    suspend fun saveArtistsToDB(artists: List<Artist>)
    suspend fun clearAll()
}