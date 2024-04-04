package com.mukesh.mymovieapp.domain.usecase


import com.mukesh.mymovieapp.data.model.artist.Artist
import com.mukesh.mymovieapp.domain.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.getArtists()

}