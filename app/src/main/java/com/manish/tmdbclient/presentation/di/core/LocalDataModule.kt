package com.manish.tmdbclient.presentation.di.core

import com.manish.tmdbclient.data.db.ArtistDao
import com.manish.tmdbclient.data.db.MovieDao
import com.manish.tmdbclient.data.db.TvShowDao
import com.manish.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.manish.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.manish.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.manish.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.manish.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.manish.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }


}