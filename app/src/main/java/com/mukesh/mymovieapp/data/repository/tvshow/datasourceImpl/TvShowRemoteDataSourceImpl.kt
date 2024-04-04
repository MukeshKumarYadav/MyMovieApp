package com.mukesh.mymovieapp.data.repository.tvshow.datasourceImpl

import com.mukesh.mymovieapp.data.api.TMDBService
import com.mukesh.mymovieapp.data.model.tvshow.TvShowList
import com.mukesh.mymovieapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

