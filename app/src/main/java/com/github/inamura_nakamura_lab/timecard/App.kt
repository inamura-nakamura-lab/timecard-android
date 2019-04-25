package com.github.inamura_nakamura_lab.timecard

import android.app.Application
import com.facebook.stetho.Stetho
import com.github.inamura_nakamura_lab.timecard.di.apiModule
import com.github.inamura_nakamura_lab.timecard.di.appModule
import com.jakewharton.threetenabp.AndroidThreeTen
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            // Android context
            androidContext(this@App)
            // modules
            modules(appModule, apiModule)
        }
        AndroidThreeTen.init(this)
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
            Timber.plant(Timber.DebugTree())
        }
    }
}