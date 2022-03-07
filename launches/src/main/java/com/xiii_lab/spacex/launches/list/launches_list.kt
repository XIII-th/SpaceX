/**
 * Created by XIII-th on 07.03.2022
 */
package com.xiii_lab.spacex.launches.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.xiii_lab.spacex.design.theme.SpaceXTheme
import com.xiii_lab.spacex.domain.launch.Launch
import com.xiii_lab.spacex.domain.launch.LaunchModel

@Composable
internal fun LaunchesListScreen(launches: List<Launch>) {
    LaunchesList(launches = launches)
}

@Composable
internal fun LaunchesList(launches: List<Launch>) {
    LazyColumn {
        items(launches, Launch::id) { item ->
            LaunchListItem(launch = item)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun LaunchListItem(launch: Launch) {
    ListItem {
        Text(text = launch.name)
    }
}

@Preview
@Composable
internal fun PreviewLaunchesList() {
    SpaceXTheme {
        val items = (0..15).map { LaunchModel(it.toString(), "Launch with name $it") }
        LaunchesList(launches = items)
    }
}

@Preview
@Composable
internal fun PreviewLaunchListItem() {
    SpaceXTheme {
        val item = LaunchModel("id_string", "Sample launch name")
        LaunchListItem(launch = item)
    }
}