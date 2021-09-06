package com.abdulkarim.solarapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abdulkarim.solarapp.MainActivity
import com.abdulkarim.solarapp.OnItemClickListener
import com.abdulkarim.solarapp.R
import com.abdulkarim.solarapp.adapter.PlanetAdapter
import com.abdulkarim.solarapp.data.Planet
import com.abdulkarim.solarapp.database.AppDatabase
import kotlinx.coroutines.launch

class PlanetListActivity : AppCompatActivity(),OnItemClickListener {


    private lateinit var planetAdapter: PlanetAdapter
    private lateinit var recyclerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_list)

        recyclerview = findViewById(R.id.planetsRv)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val database = AppDatabase.getInstance(this)

        lifecycleScope.launch {
            val planetList = database?.getPlanetDao()?.loadAllPlanet()

            planetAdapter = PlanetAdapter(planetList,this@PlanetListActivity)
            recyclerview.adapter = planetAdapter

            Log.i("TAG","list of planet : $planetList")
        }

        findViewById<ImageView>(R.id.backIv).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }

    override fun onItemClick(planet: Planet) {
        startActivity(Intent(this,PlanetDetailsActivity::class.java).putExtra("planet",planet))

    }
}