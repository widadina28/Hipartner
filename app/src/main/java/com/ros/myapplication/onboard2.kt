package com.ros.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)
        supportActionBar?.hide()

        val btnlogin1 = findViewById<Button>(R.id.btn_login1)
        val btnprevious = findViewById<Button>(R.id.btn_previous)

        btnlogin1.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

            btnprevious.setOnClickListener {
                val intent = Intent(this, onboard1::class.java)
                startActivity(intent)
            }
    }
}