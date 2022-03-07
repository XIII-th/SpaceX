package com.xiii_lab.spacex.dragons_data

import com.xiii_lab.spacex.dragons_remote.DragonRemoteDataSource
import javax.inject.Inject

/**
 * Created by XIII-th on 07.03.2022
 */
internal class DefaultDragonRepository @Inject constructor(
    private val remote: DragonRemoteDataSource
) : DragonRepository {

    override fun getDragonList() = remote.getDragonList()
}