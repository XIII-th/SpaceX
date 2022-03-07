package com.xiii_lab.spacex.dragons_data

import com.xiii_lab.spacex.domain.dragon.Dragon
import kotlinx.coroutines.flow.StateFlow

/**
 * Created by XIII-th on 07.03.2022
 */
interface DragonRepository {

    fun getDragonList(): StateFlow<List<Dragon>>
}