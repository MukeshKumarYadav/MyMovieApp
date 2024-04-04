package com.mukesh.mymovieapp.data.repository.tvshow.datasource

import com.mukesh.mymovieapp.data.model.movie.Movie
import com.mukesh.mymovieapp.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
  suspend fun getTvShowsFromDB():List<TvShow>
  suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
  suspend fun clearAll()
}