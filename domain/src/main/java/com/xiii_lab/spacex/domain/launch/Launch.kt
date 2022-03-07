package com.xiii_lab.spacex.domain.launch

import androidx.compose.runtime.Immutable

/**
 * Created by XIII-th on 07.03.2022
 */
@Immutable
interface Launch {

    val id: String
    val name: String
}