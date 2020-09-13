package com.nikunj.tasktnine

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.nikunj.tasktnine.databinding.MovieListItemBinding


class MoviesAdapter (private val movies: List<Movie>) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>(){

    override fun getItemCount() = movies.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MoviesViewHolder(
            DataBindingUtil.inflate<MovieListItemBinding>(
                LayoutInflater.from(parent.context),
                R.layout.movie_list_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.recyclerviewMovieBinding.movie = movies[position]

    }


    inner class MoviesViewHolder(
        val recyclerviewMovieBinding: MovieListItemBinding) : RecyclerView.ViewHolder(recyclerviewMovieBinding.root)

}