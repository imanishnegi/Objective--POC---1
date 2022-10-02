package com.manish.tmdbclient.data.repository.movie.datasource

import com.manish.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}