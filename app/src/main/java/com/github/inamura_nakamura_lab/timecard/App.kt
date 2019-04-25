package com.github.inamura_nakamura_lab.timecard

import android.app.Application
import com.github.inamura_nakamura_lab.timecard.di.apiModule
import com.github.inamura_nakamura_lab.timecard.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            // Android context
            androidContext(this@App)
            // modules
            modules(appModule, apiModule)
        }
    }
}