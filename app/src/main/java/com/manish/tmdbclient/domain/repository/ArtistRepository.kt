package com.manish.tmdbclient.domain.repository

import com.manish.tmdbclient.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}