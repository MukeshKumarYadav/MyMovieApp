package com.mukesh.mymovieapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mukesh.mymovieapp.R

import android.content.Intent
import androidx.databinding.DataBindingUtil
import com.mukesh.mymovieapp.presentation.artist.ArtistActivity
import com.mukesh.mymovieapp.databinding.ActivityMainBinding
import com.mukesh.mymovieapp.presentation.movie.MovieActivity
import com.mukesh.mymovieapp.presentation.tv.TvShowActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.movieButton.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }

        binding.tvButton.setOnClickListener {
            val intent = Intent(this, TvShowActivity::class.java)
            startActivity(intent)
        }

        binding.artistsButton.setOnClickListener {
            val intent = Intent(this, ArtistActivity::class.java)
            startActivity(intent)
        }
    }
}