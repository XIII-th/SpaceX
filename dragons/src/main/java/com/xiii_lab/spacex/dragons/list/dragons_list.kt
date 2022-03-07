/**
 * Created by XIII-th on 07.03.2022
 */
package com.xiii_lab.spacex.dragons.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.xiii_lab.spacex.design.theme.SpaceXTheme
import com.xiii_lab.spacex.domain.dragon.Dragon
import com.xiii_lab.spacex.domain.dragon.DragonModel
import java.util.*

@Composable
internal fun DragonsListScreen(dragons: List<Dragon>) {
    DragonsList(dragons = dragons)
}

@Composable
internal fun DragonsList(dragons: List<Dragon>) {
    LazyColumn {
        items(dragons, Dragon::id) { item ->
            DragonListItem(dragon = item)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun DragonListItem(dragon: Dragon) {
    ListItem {
        Text(text = dragon.name)
    }
}

@Preview
@Composable
internal fun PreviewDragonsList() {
    SpaceXTheme {
        val items = (0..15).map { DragonModel(it.toString(), "Dragon with name $it") }
        DragonsList(dragons = items)
    }
}

@Preview
@Composable
internal fun PreviewDragonListItem() {
    SpaceXTheme {
        val item = DragonModel("id_string", "Sample dragon name")
        DragonListItem(dragon = item)
    }
}