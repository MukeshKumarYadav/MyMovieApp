package com.mukesh.mymovieapp.domain.repository

import com.mukesh.mymovieapp.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}