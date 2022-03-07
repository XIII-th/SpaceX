package com.xiii_lab.spacex.launches.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.xiii_lab.spacex.launches_data.LaunchesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

/**
 * Created by XIII-th on 07.03.2022
 */
@HiltViewModel
internal class DefaultLaunchesListViewModel @Inject constructor(
    repository: LaunchesRepository
) : ViewModel(), LaunchesListViewModel {

    override val launches = repository.getLaunchList()
        .stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())
}