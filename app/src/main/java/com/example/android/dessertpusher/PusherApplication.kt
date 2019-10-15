package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

@Suppress("unused")
class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}