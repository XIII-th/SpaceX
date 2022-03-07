package com.xiii_lab.spacex.dragons_remote

import com.xiii_lab.spacex.domain.dragon.Dragon
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

/**
 * Created by XIII-th on 07.03.2022
 */
internal class DefaultDragonRemoteDataSource @Inject constructor() : DragonRemoteDataSource {

    override fun getDragonList() = MutableStateFlow(emptyList<Dragon>())
}