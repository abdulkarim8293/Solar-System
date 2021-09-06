package com.abdulkarim.solarapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.abdulkarim.solarapp.data.Planet
import com.abdulkarim.solarapp.data.PlanetDao

@Database(entities = [Planet::class], version = 1,exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getPlanetDao(): PlanetDao

    companion object {
        var INSTANCE:AppDatabase? = null

        fun getInstance(context: Context):AppDatabase? {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "solar_system.db"
                )
                    .build()
            }
            return INSTANCE
        }

    }
}