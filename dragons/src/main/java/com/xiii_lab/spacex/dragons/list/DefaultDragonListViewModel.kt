package com.xiii_lab.spacex.dragons.list

import androidx.lifecycle.ViewModel
import com.xiii_lab.spacex.dragons_data.DragonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by XIII-th on 07.03.2022
 */
@HiltViewModel
internal class DefaultDragonListViewModel @Inject constructor(
    repository: DragonRepository
) : ViewModel(), DragonListViewModel {

    override val dragons = repository.getDragonList()
}