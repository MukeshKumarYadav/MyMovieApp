package com.mukesh.mymovieapp.data.model.artist


import com.mukesh.mymovieapp.data.model.artist.Artist
import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("results")
    val artists: List<Artist>
)