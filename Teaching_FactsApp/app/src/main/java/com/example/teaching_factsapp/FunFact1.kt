package com.example.teaching_factsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FunFact1 : AppCompatActivity() {
    private lateinit var backButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_fact1)

        backButton = findViewById(R.id.fact1BackButton)
        nextButton = findViewById(R.id.fact1NextButton)

        backButton.setOnClickListener({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

        nextButton.setOnClickListener({
            val intent = Intent(this, FunFact2::class.java)
            startActivity(intent)
        })
    }
}