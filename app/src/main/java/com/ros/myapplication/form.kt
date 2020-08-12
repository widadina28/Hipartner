package com.ros.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        supportActionBar?.hide()

        val btnactivitysubmit = findViewById<Button>(R.id.btn_submit)
        val name = findViewById<EditText>(R.id.et_nameform)
        val dob = findViewById<EditText>(R.id.et_dob)
        val id = findViewById<EditText>(R.id.et_id)
        val gpa = findViewById<EditText>(R.id.et_gpa)
        val edu = findViewById<EditText>(R.id.et_ed)
        val achiv = findViewById<EditText>(R.id.et_achivement)
        val exp = findViewById<EditText>(R.id.et_exp)

        btnactivitysubmit.setOnClickListener {
            val nameEt = name.text.toString()
            val dobEt = dob.text.toString()
            val idEt = id.text.toString()
            val gpaEt = gpa.text.toString()
            val eduEt = edu.text.toString()
            val achivEt = achiv.text.toString()
            val expEt = exp.text.toString()

            val intent = Intent (this, ProfilScreen::class.java)
            intent.putExtra("NAMEform","$nameEt")
            intent.putExtra("DOBform","$dobEt")
            intent.putExtra("IDform","$idEt")
            intent.putExtra("GPAform","$gpaEt")
            intent.putExtra("EDUform","$eduEt")
            intent.putExtra("ACHIVform","$achivEt")
            intent.putExtra("EXPform","$expEt")
            startActivity(intent)
        }

    }
}