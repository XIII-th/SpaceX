package com.xiii_lab.spacex.domain.launch

/**
 * Created by XIII-th on 07.03.2022
 */
data class LaunchModel(
    override val id: String,
    override val name: String,
    override val details: String,
    override val flightNumber: Int,
    override val links: LaunchLinksModel
) : Launch
