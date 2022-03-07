/**
 * Created by XIII-th on 07.03.2022
 */
package com.xiii_lab.spacex.dragons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.xiii_lab.spacex.dragons.list.DefaultDragonListViewModel
import com.xiii_lab.spacex.dragons.list.DragonListViewModel
import com.xiii_lab.spacex.dragons.list.DragonsListScreen

@Composable
fun DragonsListDestination() {
    val dragonsVm: DragonListViewModel = hiltViewModel<DefaultDragonListViewModel>()
    val dragonList by dragonsVm.dragons.collectAsState()
    DragonsListScreen(dragons = dragonList)
}