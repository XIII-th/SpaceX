/**
 * Created by XIII-th on 07.03.2022
 */
package com.xiii_lab.spacex.launches.list

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.xiii_lab.spacex.design.theme.LIST_ITEM_VERTICAL_SPACING
import com.xiii_lab.spacex.design.theme.SCREEN_PADDING
import com.xiii_lab.spacex.design.theme.SpaceXTheme
import com.xiii_lab.spacex.domain.launch.Launch
import com.xiii_lab.spacex.domain.launch.LaunchLinksModel
import com.xiii_lab.spacex.domain.launch.LaunchModel
import com.xiii_lab.spacex.domain.launch.LaunchPatchModel

@Composable
internal fun LaunchesListScreen(launches: List<Launch>) {
    LaunchesList(launches = launches)
}

@Composable
internal fun LaunchesList(launches: List<Launch>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(LIST_ITEM_VERTICAL_SPACING),
        contentPadding = PaddingValues(SCREEN_PADDING)
    ) {
        items(launches, Launch::id) { item ->
            LaunchListItem(launch = item)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun LaunchListItem(launch: Launch) {
    Card(
        shape = MaterialTheme.shapes.medium.copy(
            topEnd = CornerSize(percent = 50),
            bottomEnd = CornerSize(50)
        )
    ) {
        val imageUri = launch.links.patch.small
        val flightNumber = remember(launch.flightNumber) { "#${launch.flightNumber}" }
        LaunchListItemContent(launch.name, flightNumber, imageUri)
    }
}

@Composable
internal fun LaunchListItemContent(launchName: String, flightNumber: String, imageUri: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(72.dp)
    ) {
        Column(Modifier.padding(16.dp).fillMaxWidth()) {
            Text(text = flightNumber, style = MaterialTheme.typography.overline)
            Text(text = launchName, style = MaterialTheme.typography.subtitle1)
        }
        Box(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .clip(shape = CircleShape)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(imageUri)
                    .crossfade(true)
                    .build(),
                modifier = Modifier
                    .aspectRatio(1F)
                    .padding(16.dp),
                contentDescription = null
            )
        }
    }
}

@Preview
@Composable
internal fun PreviewLaunchesList() {
    SpaceXTheme {
        val items = (0..15).map(::createSampleLaunchModel)
        LaunchesList(launches = items)
    }
}

@Preview
@Composable
internal fun PreviewLaunchListItem() {
    SpaceXTheme {
        LaunchListItem(launch = createSampleLaunchModel(91))
    }
}

/**
 * https://github.com/r-spacex/SpaceX-API/blob/master/docs/launches/v4/one.md
 */
private fun createSampleLaunchModel(flightNumber: Int) = LaunchModel(
    id = flightNumber.toString(),
    name = "CRS-20",
    details = "SpaceX's 20th and final Crew Resupply Mission under the original NASA CRS contract, this mission brings essential supplies to the International Space Station using SpaceX's reusable Dragon spacecraft. It is the last scheduled flight of a Dragon 1 capsule. (CRS-21 and up under the new Commercial Resupply Services 2 contract will use Dragon 2.) The external payload for this mission is the Bartolomeo ISS external payload hosting platform. Falcon 9 and Dragon will launch from SLC-40, Cape Canaveral Air Force Station and the booster will land at LZ-1. The mission will be complete with return and recovery of the Dragon capsule and down cargo.",
    flightNumber = flightNumber,
    links = LaunchLinksModel(
        LaunchPatchModel(
            small = "https://images2.imgbox.com/53/22/dh0XSLXO_o.png",
            large = "https://images2.imgbox.com/15/2b/NAcsTEB6_o.png"
        )
    )
)