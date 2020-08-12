package com.ros.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ProfilScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_screen)
        supportActionBar?.hide()

        val intent = intent
        val name = intent.getStringExtra("NAMEform")
        val dob = intent.getStringExtra("DOBform")
        val id = intent.getStringExtra("IDform")
        val gpa = intent.getStringExtra("GPAform")
        val edu = intent.getStringExtra("EDUform")
        val achiv = intent.getStringExtra("ACHIVform")
        val exp = intent.getStringExtra("EXPform")

        val resultTv = findViewById<TextView>(R.id.tv_text)
        resultTv.text = "NAME: "+name+"\nDATE OF BIRTH: "+dob+"\nIDENTITY NUMBER: "+id+"\nGPA: "+gpa+"\nEDUCATION: "+edu+"\nACHIVEMENT: "+achiv+"\nEXPERIENCES: "+exp+""
    }
}