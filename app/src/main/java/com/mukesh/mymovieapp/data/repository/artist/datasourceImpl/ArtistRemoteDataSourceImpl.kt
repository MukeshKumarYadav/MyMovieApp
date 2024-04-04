package com.mukesh.mymovieapp.data.repository.artist.datasourceImpl

import com.mukesh.mymovieapp.data.api.TMDBService
import com.mukesh.mymovieapp.data.model.artist.ArtistList
import com.mukesh.mymovieapp.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

