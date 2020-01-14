package com.example.myrestaurantapps

import com.example.core.databaseModule
import com.example.core.repositoryModule
import com.example.core.useCaseModule
import com.google.android.play.core.splitcompat.SplitCompatApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApp : SplitCompatApplication() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // Koin Android logger
            androidLogger()
            //inject Android context
            androidContext(this@MyApp)
            // use modules
            modules(listOf(databaseModule, repositoryModule, useCaseModule))
        }
    }
}
