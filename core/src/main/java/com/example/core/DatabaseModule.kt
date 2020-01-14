package com.example.core

import androidx.room.Room
import com.example.database.database.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule =
    module {
        single { Room.databaseBuilder(androidApplication(),
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME).allowMainThreadQueries().build()}
        single { (get() as AppDatabase).chefDao() }
    }
