package com.xiii_lab.spacex.launches_remote

import com.xiii_lab.spacex.domain.launch.Launch

/**
 * Created by XIII-th on 07.03.2022
 */
interface LaunchesRemoteDataSource {

    suspend fun getLaunchList(): List<Launch>
}