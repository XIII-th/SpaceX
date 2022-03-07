package com.xiii_lab.spacex.launches_data

import com.xiii_lab.spacex.domain.launch.Launch
import kotlinx.coroutines.flow.Flow

/**
 * Created by XIII-th on 07.03.2022
 */
interface LaunchesRepository {

    fun getLaunchList(): Flow<List<Launch>>
}