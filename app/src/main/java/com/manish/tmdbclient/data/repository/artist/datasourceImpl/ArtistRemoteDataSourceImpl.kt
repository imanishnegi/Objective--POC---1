package com.manish.tmdbclient.data.repository.artist.datasourceImpl

import com.manish.tmdbclient.data.api.TMDBService
import com.manish.tmdbclient.data.model.artist.ArtistList
import com.manish.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

