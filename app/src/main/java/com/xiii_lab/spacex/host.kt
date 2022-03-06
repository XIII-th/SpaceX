/**
 * Created by XIII-th on 07.03.2022
 */
package com.xiii_lab.spacex

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.xiii_lab.spacex.design.theme.SpaceXTheme
import com.xiii_lab.spacex.navigation.DragonList
import com.xiii_lab.spacex.navigation.LandpadList
import com.xiii_lab.spacex.navigation.LaunchpadList
import com.xiii_lab.spacex.navigation.Routes
import com.xiii_lab.spacex.navigation.Routes.HomeRoute

@Composable
internal fun SpaceXHostScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = remember(navBackStackEntry) {
                Routes.fromNavigationEntry(navBackStackEntry)
            }

            BottomNavigation {
                Routes.primaryRoutes.forEach { route ->
                    BottomNavigationItem(
                        icon = { Icon(Icons.Filled.Star, contentDescription = null) },
                        label = {
                            Text(text = stringResource(id = route.label))
                        },
                        selected = route == currentRoute,
                        onClick = {
                            route.navigate(navController)
                        })
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = HomeRoute.name,
            Modifier.padding(innerPadding)
        ) {
            DragonList.route(this) {
                Text(text = "Dragons screen")
            }
            LaunchpadList.route(this) {
                Text(text = "Launchpads screen")
            }
            LandpadList.route(this) {
                Text(text = "Landpads screen")
            }
        }
    }
}

@Preview
@Composable
internal fun PreviewSpaceXHostScreen() {
    SpaceXTheme {
        SpaceXHostScreen()
    }
}