/**
 * Created by XIII-th on 07.03.2022
 */
package com.xiii_lab.spacex.launches

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.xiii_lab.spacex.launches.list.DefaultLaunchesListViewModel
import com.xiii_lab.spacex.launches.list.LaunchesListViewModel
import com.xiii_lab.spacex.launches.list.LaunchesListScreen

@Composable
fun LaunchesListDestination() {
    val launchesVm: LaunchesListViewModel = hiltViewModel<DefaultLaunchesListViewModel>()
    val launchList by launchesVm.launches.collectAsState()
    LaunchesListScreen(launches = launchList)
}