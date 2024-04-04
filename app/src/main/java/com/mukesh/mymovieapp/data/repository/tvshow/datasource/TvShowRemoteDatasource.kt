package com.mukesh.mymovieapp.data.repository.tvshow.datasource

import com.mukesh.mymovieapp.data.model.movie.MovieList
import com.mukesh.mymovieapp.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}