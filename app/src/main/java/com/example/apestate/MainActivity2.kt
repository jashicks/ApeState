package com.example.apestate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apestate.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val chimpImageButton = binding.chimpButton
        chimpImageButton.setOnClickListener {
            val intent = Intent(this, ChimpActivity::class.java)
            startActivity(intent)
        }

        val bonoboImageButton = binding.bonoboButton
        bonoboImageButton?.setOnClickListener {
            val intent = Intent(this, BonoboActivity::class.java)
            startActivity(intent)
        }

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back_arrow)
        title = ""

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}