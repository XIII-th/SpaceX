package com.xiii_lab.spacex.navigation

import androidx.navigation.NavBackStackEntry

/**
 * Created by XIII-th on 07.03.2022
 */
object Routes {

    val HomeRoute = DragonList

    val primaryRoutes = listOf(DragonList, LaunchpadList, LandpadList)

    fun fromNavigationEntry(backstackEntry: NavBackStackEntry?): Route {
        val route = backstackEntry?.run { destination.route } ?: return HomeRoute
        val routeNameEndIndex = route.indexOfAny(charArrayOf('/', '?'))
        val routeName = if (routeNameEndIndex == -1)
            route
        else
            route.substring(0, routeNameEndIndex)
        return primaryRoutes.first { it.name == routeName }
    }

}