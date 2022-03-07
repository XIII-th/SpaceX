package com.xiii_lab.spacex.dragons_data

import com.xiii_lab.spacex.domain.dragon.Dragon
import com.xiii_lab.spacex.dragons_remote.DragonRemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Created by XIII-th on 07.03.2022
 */
internal class DefaultDragonRepository @Inject constructor(
    private val remote: DragonRemoteDataSource
) : DragonRepository {

    override fun getDragonList(): Flow<List<Dragon>> = flow {
        emit(remote.getDragonList())
    }
}