package com.xiii_lab.spacex.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder

/**
 * Created by XIII-th on 07.03.2022
 */
interface Route {

    val name: String

    fun route(builder: NavGraphBuilder, destination: @Composable (NavBackStackEntry) -> Unit)
}
