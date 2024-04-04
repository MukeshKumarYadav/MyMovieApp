package com.mukesh.mymovieapp.data.model.tvshow


import com.mukesh.mymovieapp.data.model.tvshow.TvShow
import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("results")
    val tvShows: List<TvShow>
)