package com.example.fruitshopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val button = findViewById<ImageView>(R.id.imageView2)
        button.setOnClickListener{
            val intent = Intent(this, details::class.java)
            startActivity(intent)
        }
    }
}