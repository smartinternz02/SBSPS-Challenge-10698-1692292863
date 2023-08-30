package com.example.evstation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factText = findViewById<TextView>(R.id.factText)
        val evFacts = resources.getStringArray(R.array.ev_facts)
        val randomFact = evFacts.random()
        factText.text = randomFact

        val nextButton = findViewById<Button>(R.id.nextButton)

        nextButton.setOnClickListener {
            // Start the next activity here
            val intent = Intent(this, calc::class.java)
            startActivity(intent)
        }
    }
}