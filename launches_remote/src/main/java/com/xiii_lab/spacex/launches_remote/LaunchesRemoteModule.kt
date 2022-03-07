package com.xiii_lab.spacex.launches_remote

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit

/**
 * Created by XIII-th on 07.03.2022
 */
@Module
@InstallIn(ViewModelComponent::class)
internal class LaunchesRemoteModule {

    @Provides
    fun provideLaunchesRemoteDataSource(launchesService: LaunchesService): LaunchesRemoteDataSource =
        DefaultLaunchesRemoteDataSource(launchesService)

    @Provides
    fun provideLaunchesService(retrofit: Retrofit) = retrofit.create(LaunchesService::class.java)
}