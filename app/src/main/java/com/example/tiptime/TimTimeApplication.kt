package com.example.tiptime

import android.app.Application
import com.google.android.material.color.DynamicColors

class TimTimeApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        DynamicColors.applyToActivitiesIfAvailable(this) //, R.style.Theme_TipTime_Overlay)
    }
}