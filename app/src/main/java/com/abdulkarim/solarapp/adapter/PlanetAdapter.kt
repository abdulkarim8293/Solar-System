package com.abdulkarim.solarapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.abdulkarim.solarapp.OnItemClickListener
import com.abdulkarim.solarapp.R
import com.abdulkarim.solarapp.data.Planet

class PlanetAdapter(private val planets: List<Planet>?, private val onItemClickListener: OnItemClickListener)  : RecyclerView.Adapter<PlanetAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_planet, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val planet = planets?.get(position)

        holder.name.text = planet?.name
        holder.size.text = planet?.size
        holder.description.text = planet?.description

        holder.rootLayout.setOnClickListener {
            planet?.let { it -> onItemClickListener.onItemClick(it) }
        }

    }

    override fun getItemCount(): Int {
        return planets?.size!!
    }

    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val  name:TextView = itemView.findViewById(R.id.planetNameTv)
        val  size:TextView = itemView.findViewById(R.id.planetSizeTv)
        val  description:TextView = itemView.findViewById(R.id.planetDescriptionTv)
        val rootLayout: ConstraintLayout = itemView.findViewById(R.id.ll_cl)


    }

}