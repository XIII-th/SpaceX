package com.xiii_lab.spacex.domain.launch

/**
 * Created by XIII-th on 07.03.2022
 */
data class LaunchPatchModel(
    override val small: String,
    override val large: String
) : LaunchPatch
