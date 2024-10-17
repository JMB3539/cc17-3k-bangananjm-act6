package com.example.a30daysoffitness

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysoffitness.adapters.FitnessTipAdapter
import com.example.a30daysoffitness.models.FitnessTip

class MainActivity : AppCompatActivity() {
    companion object {
        val fitnessTips = listOf(
            FitnessTip(1, "Full Body Workout", R.drawable.day1,
                "Start with a warm-up, followed by push-ups, squats,planks and lunges."),
            FitnessTip(2, "Cardio Blast", R.drawable.day2,
                "Go for a 20-30 minute cardio workout, including running, cycling, and swimming."),
            FitnessTip(3, "Upper Body Strength", R.drawable.day3,
                "Focus on dumbell shoulder press, bench press, and lateral raises."),
            FitnessTip(4, "Lower Body Strength", R.drawable.day4,
                "Squats, lunges, and deadlifts are popular lower-body exercises."),
            FitnessTip(5, "Core Workout", R.drawable.day5,
                "Planks,bicycle crunches and Russian twists to build core strength"),
            FitnessTip(6, "Yoga & Flexibility", R.drawable.day6,
                "Improve flexibility and relaxation through yoga."),
            FitnessTip(7, "Active Recovery", R.drawable.day7,
                "Light activity to promote recovery, like walking or cycling."),
            FitnessTip(8, "HIIT Workout", R.drawable.day8,
                "High-Intensity Interval Training for a quick burn."),
            FitnessTip(9, "Total Body Strength", R.drawable.day9,
                "Use weights for a full-body strength workout."),
            FitnessTip(10, "Cardio Kickboxing", R.drawable.day10,
                "Combine cardio with martial arts for a fun challenge."),
            FitnessTip(11, "Full Body Workout", R.drawable.day1,
                "Repeat the full-body workout with a focus on form."),
            FitnessTip(12, "Cardio Blast", R.drawable.day2,
                "Increase your cardio duration for a tougher challenge."),
            FitnessTip(13, "Upper Body Strength", R.drawable.day3,
                "Add more reps to your upper body exercises."),
            FitnessTip(14, "Lower Body Strength", R.drawable.day4,
                "Incorporate weights into your lower body workout."),
            FitnessTip(15, "Core Workout", R.drawable.day5,
                "Try new core exercises for added variety."),
            FitnessTip(16, "Yoga & Flexibility", R.drawable.day6,
                "Explore different yoga poses for a full-body stretch."),
            FitnessTip(17, "Active Recovery", R.drawable.day7,
                "Engage in leisure activities to stay active."),
            FitnessTip(18, "HIIT Workout", R.drawable.day8,
                "Challenge yourself with new HIIT exercises."),
            FitnessTip(19, "Total Body Strength", R.drawable.day9,
                "Focus on lifting heavier weights safely."),
            FitnessTip(20, "Cardio Kickboxing", R.drawable.day10,
                "Learn new combinations for a challenging workout."),
            FitnessTip(21, "Full Body Workout", R.drawable.day1,
                "Consolidate all your strength from the previous workouts."),
            FitnessTip(22, "Cardio Blast", R.drawable.day2,
                "Try interval sprints during your cardio session."),
            FitnessTip(23, "Upper Body Strength", R.drawable.day3,
                "Improve your endurance with higher reps."),
            FitnessTip(24, "Lower Body Strength", R.drawable.day4,
                "Maintain good form while increasing weight."),
            FitnessTip(25, "Core Workout", R.drawable.day5,
                "Add variety with different core exercises."),
            FitnessTip(26, "Yoga & Flexibility", R.drawable.day6,
                "Attend a yoga class for professional guidance."),
            FitnessTip(27, "Active Recovery", R.drawable.day7,
                "Participate in low-intensity activities."),
            FitnessTip(28, "HIIT Workout", R.drawable.day8,
                "Focus on shorter rest intervals to increase intensity."),
            FitnessTip(29, "Total Body Strength", R.drawable.day9,
                "Incorporate compound movements into your routine."),
            FitnessTip(30, "Final Challenge", R.drawable.day30,
                "Combine all workouts into one final session.")
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = FitnessTipAdapter(fitnessTips)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}