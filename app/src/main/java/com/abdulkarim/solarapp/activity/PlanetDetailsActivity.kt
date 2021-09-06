package com.abdulkarim.solarapp.activity

import android.content.Intent
import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.abdulkarim.solarapp.MainActivity
import com.abdulkarim.solarapp.R
import com.abdulkarim.solarapp.data.Planet
import com.squareup.picasso.Picasso

class PlanetDetailsActivity : AppCompatActivity() {

    private lateinit var planetImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_details)

        val planet = intent.getSerializableExtra("planet") as Planet

        findViewById<TextView>(R.id.planetTitleNameTv).text = planet.name
        findViewById<TextView>(R.id.planetSizeTv).text = planet.size
        findViewById<TextView>(R.id.planetDescriptionTv).text = planet.description

        planetImage = findViewById(R.id.planetImageIv)

        findViewById<ImageView>(R.id.backIv).setOnClickListener {
            startActivity(Intent(this, PlanetListActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        Picasso.get().load(planet.imageUrl).into(planetImage)



    }
}