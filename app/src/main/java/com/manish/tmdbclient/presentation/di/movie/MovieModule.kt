package com.manish.tmdbclient.presentation.di.movie

import com.manish.tmdbclient.domain.usecase.GetMoviesUseCase
import com.manish.tmdbclient.domain.usecase.UpdateMoviesUsecase
import com.manish.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class MovieModule {
    @ActivityScoped
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}