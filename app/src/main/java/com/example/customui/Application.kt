package com.example.customui

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class Application : Application() {
    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    }
}