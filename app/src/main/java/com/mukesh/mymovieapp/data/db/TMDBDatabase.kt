package com.mukesh.mymovieapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mukesh.mymovieapp.data.model.artist.Artist
import com.mukesh.mymovieapp.data.model.movie.Movie
import com.mukesh.mymovieapp.data.model.tvshow.TvShow


@Database(
    entities = [Movie::class, TvShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    //define abstract funtions to get DAO interfaces
    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TvShowDao
    abstract fun artistDao(): ArtistDao

}