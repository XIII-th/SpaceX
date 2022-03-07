package com.xiii_lab.spacex.dragons.list

import com.xiii_lab.spacex.domain.dragon.Dragon
import kotlinx.coroutines.flow.StateFlow

/**
 * Created by XIII-th on 07.03.2022
 */
internal interface DragonListViewModel {

    val dragons: StateFlow<List<Dragon>>
}