package com.xiii_lab.spacex.dragons_remote

import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

/**
 * Created by XIII-th on 07.03.2022
 */
internal class DefaultDragonRemoteDataSource(
    private val dragonService: DragonService
) : DragonRemoteDataSource {

    override suspend fun getDragonList() = withContext(IO) {
        val response = dragonService.listDragons().execute()
        response.body() ?: emptyList()
    }
}