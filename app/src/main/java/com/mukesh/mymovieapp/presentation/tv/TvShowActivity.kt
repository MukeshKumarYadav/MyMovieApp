package com.mukesh.mymovieapp.presentation.tv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mukesh.mymovieapp.R
import com.mukesh.mymovieapp.databinding.ActivityTvShowBinding
import com.mukesh.mymovieapp.presentation.di.Injector
import javax.inject.Inject

/**
 * [TvShowActivity]
 * screen to show the list of tv shows with details
 * @author Mukesh Kumar Yadav on 2024-04-04
 */
class TvShowActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: TvShowViewModelFactory
    private lateinit var tvShowViewModel: TvShowViewModel
    private lateinit var adapter: TvAdapter
    private lateinit var binding: ActivityTvShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tv_show)
        (application as Injector).createTvShowSubComponent()
            .inject(this)

        tvShowViewModel = ViewModelProvider(this, factory)
            .get(TvShowViewModel::class.java)
        initRecyclerView()
    }

    //setup Recycler view
    private fun initRecyclerView() {
        binding.tvRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = TvAdapter()
        binding.tvRecyclerView.adapter = adapter
        displayPopularTvShows()
    }

    // //Display tv shows in list
    private fun displayPopularTvShows() {
        binding.tvProgressBar.visibility = View.VISIBLE
        val responseLiveData = tvShowViewModel.getTvShows()
        responseLiveData.observe(this, Observer {
            if (it != null) {
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.tvProgressBar.visibility = View.GONE
            } else {
                binding.tvProgressBar.visibility = View.GONE
                Toast.makeText(applicationContext, "No data available", Toast.LENGTH_LONG).show()
            }
        })
    }

    /*
    *Create option menu to refresh and reload the data
     */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.update, menu)
        return true
    }

    /*
     *Handle refresh option menu button click
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_update -> {
                updateTvShows()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }

    }

    /*
   *Update tv show list on refresh click
    */
    private fun updateTvShows() {
        binding.tvProgressBar.visibility = View.VISIBLE
        val response = tvShowViewModel.updateTvShows()
        response.observe(this, Observer {
            if (it != null) {
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.tvProgressBar.visibility = View.GONE
            } else {
                binding.tvProgressBar.visibility = View.GONE
            }
        })
    }
}