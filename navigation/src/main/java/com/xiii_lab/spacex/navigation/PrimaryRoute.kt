package com.xiii_lab.spacex.navigation

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

/**
 * Created by XIII-th on 07.03.2022
 */
abstract class PrimaryRoute : Route {

    @get:StringRes
    abstract val label: Int

    final override fun route(builder: NavGraphBuilder, destination: @Composable (NavBackStackEntry) -> Unit) {
        builder.composable(name, content = destination)
    }
}
