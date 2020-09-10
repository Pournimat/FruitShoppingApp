package com.example.fruitshopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val button = findViewById<ImageView>(R.id.imageView3)
        button.setOnClickListener{
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)
        }
    }
}