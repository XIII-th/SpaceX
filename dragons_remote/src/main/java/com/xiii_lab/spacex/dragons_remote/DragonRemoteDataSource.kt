package com.xiii_lab.spacex.dragons_remote

import com.xiii_lab.spacex.domain.dragon.Dragon
import kotlinx.coroutines.flow.StateFlow

/**
 * Created by XIII-th on 07.03.2022
 */
interface DragonRemoteDataSource {

    fun getDragonList(): StateFlow<List<Dragon>>
}