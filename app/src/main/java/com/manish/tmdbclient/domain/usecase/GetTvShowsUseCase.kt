package com.manish.tmdbclient.domain.usecase

import com.manish.tmdbclient.data.model.tvshow.TvShow
import com.manish.tmdbclient.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()
}