package com.xiii_lab.spacex.launches.list

import com.xiii_lab.spacex.domain.launch.Launch
import kotlinx.coroutines.flow.StateFlow

/**
 * Created by XIII-th on 07.03.2022
 */
internal interface LaunchesListViewModel {

    val launches: StateFlow<List<Launch>>
}