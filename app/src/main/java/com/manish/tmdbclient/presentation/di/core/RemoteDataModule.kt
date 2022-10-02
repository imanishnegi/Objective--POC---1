package com.manish.tmdbclient.presentation.di.core

import com.manish.tmdbclient.BuildConfig
import com.manish.tmdbclient.data.api.TMDBService
import com.manish.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import com.manish.tmdbclient.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.manish.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import com.manish.tmdbclient.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.manish.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.manish.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule() {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, BuildConfig.API_KEY
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, BuildConfig.API_KEY
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, BuildConfig.API_KEY
        )
    }


}