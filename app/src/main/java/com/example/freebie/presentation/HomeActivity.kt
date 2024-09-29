package com.example.freebie.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.freebie.R
import com.example.freebie.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeTab.setOnClickListener {
            Log.d("HomeActivity", "Home tab clicked")
        }

        binding.searchTab.setOnClickListener {
            Log.d("HomeActivity", "Search tab clicked")
        }
    }
}