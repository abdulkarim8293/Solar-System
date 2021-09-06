package com.abdulkarim.solarapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import com.abdulkarim.solarapp.activity.PlanetListActivity
import com.abdulkarim.solarapp.data.Planet
import com.abdulkarim.solarapp.database.AppDatabase
import kotlinx.coroutines.launch
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        insertPlanetsToDb()

        findViewById<Button>(R.id.exploreBtn).setOnClickListener {
            startActivity(Intent(this,PlanetListActivity::class.java))
        }




    }

   private  fun insertPlanetsToDb() {

        val database = AppDatabase.getInstance(this)


        lifecycleScope.launch {
            val list = database?.getPlanetDao()?.loadAllPlanet()
            if (list?.size == 0){
                database.getPlanetDao().insertAllPlanet(getAllPlanets())
            }

        }

    }

    private fun getAllPlanets():List<Planet>{

        val planets = ArrayList<Planet>()

        planets.add(Planet(0,AppConstant.MERCURY,AppConstant.SIZE_OF_MERCURY,AppConstant.IMAGE_URL_OF_MERCURY,AppConstant.DESCRIPTION_OF_MERCURY))
        planets.add(Planet(0,AppConstant.VENUS,AppConstant.SIZE_OF_VENUS,AppConstant.IMAGE_URL_OF_VENUS,AppConstant.DESCRIPTION_OF_VENUS))
        planets.add(Planet(0,AppConstant.EARTH,AppConstant.SIZE_OF_EARTH,AppConstant.IMAGE_URL_OF_EARTH,AppConstant.DESCRIPTION_OF_EARTH))
        planets.add(Planet(0,AppConstant.MARS,AppConstant.SIZE_OF_MARS,AppConstant.IMAGE_URL_OF_MARS,AppConstant.DESCRIPTION_OF_MARS))
        planets.add(Planet(0,AppConstant.JUPITER,AppConstant.SIZE_OF_JUPITER,AppConstant.IMAGE_URL_OF_JUPITER,AppConstant.DESCRIPTION_OF_JUPITER))
        planets.add(Planet(0,AppConstant.SATURN,AppConstant.SIZE_OF_SATURN,AppConstant.IMAGE_URL_OF_SATURN,AppConstant.DESCRIPTION_OF_SATURN))
        planets.add(Planet(0,AppConstant.URANUS,AppConstant.SIZE_OF_URANUS,AppConstant.IMAGE_URL_OF_URANUS,AppConstant.DESCRIPTION_OF_URANUS))
        planets.add(Planet(0,AppConstant.NEPTUNE,AppConstant.SIZE_OF_NEPTUNE,AppConstant.IMAGE_URL_OF_NEPTUNE,AppConstant.DESCRIPTION_OF_NEPTUNE))

        return planets

    }


}