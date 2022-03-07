package com.xiii_lab.spacex.launches_remote

import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

/**
 * Created by XIII-th on 07.03.2022
 */
internal class DefaultLaunchesRemoteDataSource(
    private val launchesService: LaunchesService
) : LaunchesRemoteDataSource {

    override suspend fun getLaunchList() = withContext(IO) {
        val response = launchesService.listLaunches().execute()
        response.body() ?: emptyList()
    }
}