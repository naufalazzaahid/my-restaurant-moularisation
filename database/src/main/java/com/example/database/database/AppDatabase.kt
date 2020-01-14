package com.example.database.database

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.Database
import com.example.database.dao.ChefDao
import com.example.database.entity.ChefEntity


@Database(entities = [ChefEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        private val LOG_TAG = AppDatabase::class.java.simpleName
        private val LOCK = Any()
        const val DATABASE_NAME = "personlist"
        private var sInstance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase? {
            if (sInstance == null) {
                synchronized(LOCK) {
                    Log.d(LOG_TAG, "Creating new database instance")
                    sInstance = Room.databaseBuilder(
                        context.getApplicationContext(),
                        AppDatabase::class.java, AppDatabase.DATABASE_NAME
                    )
                        .build()
                }
            }
            Log.d(LOG_TAG, "Getting the database instance")
            return sInstance
        }
    }

    abstract fun chefDao(): ChefDao
}
