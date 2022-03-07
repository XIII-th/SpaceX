package com.xiii_lab.spacex.domain.dragon

import androidx.compose.runtime.Immutable
import java.util.*

/**
 * Created by XIII-th on 07.03.2022
 */
@Immutable
interface Dragon {

    val id: UUID
    val name: String
}