package com.manish.tmdbclient.domain.usecase

import com.manish.tmdbclient.data.model.movie.Movie
import com.manish.tmdbclient.domain.repository.MovieRepository

class UpdateMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}