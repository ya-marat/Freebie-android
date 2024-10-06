package com.example.freebie.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.freebie.R
import com.example.freebie.databinding.ActivityMainAppBinding

class MainAppActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigationView()
    }

    private fun setupBottomNavigationView(){
        binding.bottomMenu.itemIconTintList = null
        binding.bottomMenu.setOnItemSelectedListener {

            when(it.itemId){
                R.id.search_tab -> {
                }

                R.id.home_tab -> {
                }

                R.id.saved_tab -> {

                }

                R.id.cart_tab -> {

                }

                R.id.account_tab -> {

                }
            }

            true
        }
    }
}