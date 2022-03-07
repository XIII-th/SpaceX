package com.xiii_lab.spacex.dragons_remote

import com.xiii_lab.spacex.domain.dragon.Dragon

/**
 * Created by XIII-th on 07.03.2022
 */
interface DragonRemoteDataSource {

    suspend fun getDragonList(): List<Dragon>
}