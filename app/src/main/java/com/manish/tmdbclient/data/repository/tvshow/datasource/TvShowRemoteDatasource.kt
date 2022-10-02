package com.manish.tmdbclient.data.repository.tvshow.datasource

import com.manish.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}