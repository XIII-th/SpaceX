package com.xiii_lab.spacex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.xiii_lab.spacex.design.theme.SpaceXTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by XIII-th on 06.03.2022
 */
@AndroidEntryPoint
internal class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpaceXTheme {
                SpaceXHostScreen()
            }
        }
    }
}