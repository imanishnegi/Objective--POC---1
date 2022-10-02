package com.manish.tmdbclient.data.repository.tvshow.datasourceImpl

import com.manish.tmdbclient.data.api.TMDBService
import com.manish.tmdbclient.data.model.tvshow.TvShowList
import com.manish.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

