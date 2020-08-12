package com.ros.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class regist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)
        supportActionBar?.hide()

        val btnactivityaccount = findViewById<Button>(R.id.btn_create)

        btnactivityaccount.setOnClickListener {
            val intent = Intent (this, form::class.java)
            startActivity(intent)
        }
    }
}