package com.ros.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        val btnactivitylogin = findViewById<Button>(R.id.btn_login)
        val btnactivitycreate = findViewById<Button>(R.id.btn_regist)

        btnactivitylogin.setOnClickListener {
            val intent = Intent (this, form::class.java)
            startActivity(intent)
        }

        btnactivitycreate.setOnClickListener {
            val intent = Intent (this, regist::class.java)
            startActivity(intent)
        }
    }
}