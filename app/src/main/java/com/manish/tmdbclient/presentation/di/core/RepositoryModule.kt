package com.manish.tmdbclient.presentation.di.core

import com.manish.tmdbclient.data.repository.artist.ArtistRepositoryImpl
import com.manish.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.manish.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.manish.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import com.manish.tmdbclient.data.repository.movie.MovieRepositoryImpl
import com.manish.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.manish.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.manish.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import com.manish.tmdbclient.data.repository.tvshow.TvShowRepositoryImpl
import com.manish.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.manish.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.manish.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.manish.tmdbclient.domain.repository.ArtistRepository
import com.manish.tmdbclient.domain.repository.MovieRepository
import com.manish.tmdbclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}