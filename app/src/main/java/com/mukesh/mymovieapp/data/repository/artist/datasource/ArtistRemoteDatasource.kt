package com.mukesh.mymovieapp.data.repository.artist.datasource

import com.mukesh.mymovieapp.data.model.artist.ArtistList
import com.mukesh.mymovieapp.data.model.movie.MovieList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}