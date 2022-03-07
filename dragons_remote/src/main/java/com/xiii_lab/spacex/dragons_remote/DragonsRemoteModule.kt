package com.xiii_lab.spacex.dragons_remote

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

/**
 * Created by XIII-th on 07.03.2022
 */
@Module
@InstallIn(ViewModelComponent::class)
internal interface DragonsRemoteModule {

    @Binds
    fun bindDragonRemoteDataSource(impl: DefaultDragonRemoteDataSource): DragonRemoteDataSource
}