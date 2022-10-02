package com.manish.tmdbclient.data.repository.artist.datasource

import com.manish.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}