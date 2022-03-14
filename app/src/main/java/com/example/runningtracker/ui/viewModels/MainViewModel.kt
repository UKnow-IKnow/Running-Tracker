package com.example.runningtracker.ui.viewModels

import android.view.View
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.runningtracker.data.Run
import com.example.runningtracker.data.repositories.MainRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {

    fun insertRun(run : Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}