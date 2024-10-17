package com.example.a30daysoffitness.adapters

import android.view.LayoutInflater
import android.view.View
import com.example.a30daysoffitness.models.FitnessTip
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysoffitness.R

    class FitnessTipAdapter (private val fitnessTips: List<FitnessTip>) :
        RecyclerView.Adapter<FitnessTipAdapter.FitnessTipViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FitnessTipViewHolder{
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_fitness_tip, parent, false)
            return FitnessTipViewHolder(view)
        }

        override fun onBindViewHolder(holder: FitnessTipViewHolder, position: Int) {
            val fitnessTip = fitnessTips[position]
            holder.daynumber.text = "Day ${fitnessTip.day}"
            holder.fitnessTittle.text = fitnessTip.title
            holder.fitnessDescription.text = fitnessTip.description
            holder.fitnessImage.setImageResource(fitnessTip.imageResId)
        }

        override fun getItemCount(): Int = fitnessTips.size

        class FitnessTipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val daynumber: TextView = itemView.findViewById(R.id.day_number)
            val fitnessTittle: TextView = itemView.findViewById(R.id.fitness_tittle)
            val fitnessDescription: TextView = itemView.findViewById(R.id.fitness_description)
            val fitnessImage: ImageView = itemView.findViewById(R.id.fitness_image)
        }
    }