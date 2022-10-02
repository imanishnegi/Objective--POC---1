package com.manish.tmdbclient.domain.usecase

import com.manish.tmdbclient.data.model.artist.Artist
import com.manish.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}