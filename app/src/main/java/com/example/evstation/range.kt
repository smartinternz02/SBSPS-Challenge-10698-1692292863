package com.example.evstation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class range : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_range)


        val rangeee = intent.getDoubleExtra("rangee", 0.0).toString() + " km"

        val teve = findViewById<TextView>(R.id.textView2)
        teve.setText(rangeee)

    }
}