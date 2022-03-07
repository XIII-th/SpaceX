package com.xiii_lab.spacex.dragons_remote

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
internal class DragonsRemoteModule {

    @Provides
    fun provideDragonRemoteDataSource(dragonService: DragonService): DragonRemoteDataSource =
        DefaultDragonRemoteDataSource(dragonService)

    @Provides
    fun provideDragonService(retrofit: Retrofit) = retrofit.create(DragonService::class.java)
}