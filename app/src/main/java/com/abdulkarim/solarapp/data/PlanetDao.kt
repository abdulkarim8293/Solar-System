package com.abdulkarim.solarapp.data

import androidx.room.*

@Dao
interface PlanetDao {

    @Insert()
    suspend fun insertAllPlanet(planets: List<Planet>)

    @Query("SELECT * FROM planet_table")
    suspend fun loadAllPlanet(): List<Planet>

}