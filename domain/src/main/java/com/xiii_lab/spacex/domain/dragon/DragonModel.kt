package com.xiii_lab.spacex.domain.dragon

import java.util.*

/**
 * Created by XIII-th on 07.03.2022
 */
data class DragonModel(
    override val id: UUID,
    override val name: String
) : Dragon
