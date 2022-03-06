package com.example.runningtracker

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class RunApplication: Application(){

    //setup for timber
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}