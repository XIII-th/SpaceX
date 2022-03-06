package com.xiii_lab.spacex.navigation

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
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

    fun navigate(navController: NavController) {
        navController.navigate(name) {
            /*
            Pop up to the start destination of the graph to avoid building up a large stack of
            destinations on the back stack as users select items
             */
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            // Avoid multiple copies of the same destination when reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }
    }
}
