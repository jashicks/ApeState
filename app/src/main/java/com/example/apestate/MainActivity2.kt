package com.example.apestate

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
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

        val orangutanImageButton = binding.orangutanButton
        orangutanImageButton?.setOnClickListener {
            val intent = Intent(this, OrangutanActivity::class.java)
            startActivity(intent)
        }

        val gibbonImageButton = binding.gibbonButton
        gibbonImageButton?.setOnClickListener {
            val intent = Intent(this, GibbonActivity::class.java)
            startActivity(intent)
        }

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back_arrow)
        title = ""

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
