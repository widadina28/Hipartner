package com.ros.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard1)
        supportActionBar?.hide()

        val btnnext = findViewById<Button>(R.id.btn_next)

        btnnext.setOnClickListener {
            val intent = Intent (this, onboard2::class.java)
            startActivity(intent)
        }
    }
}