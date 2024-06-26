package com.mukesh.mymovieapp.domain.usecase

import com.mukesh.mymovieapp.data.model.tvshow.TvShow
import com.mukesh.mymovieapp.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShows()
}