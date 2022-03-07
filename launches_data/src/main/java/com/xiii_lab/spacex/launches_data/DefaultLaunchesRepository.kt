package com.xiii_lab.spacex.launches_data

import com.xiii_lab.spacex.domain.launch.Launch
import com.xiii_lab.spacex.launches_remote.LaunchesRemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Created by XIII-th on 07.03.2022
 */
internal class DefaultLaunchesRepository @Inject constructor(
    private val remote: LaunchesRemoteDataSource
) : LaunchesRepository {

    override fun getLaunchList(): Flow<List<Launch>> = flow {
        emit(remote.getLaunchList())
    }
}