package com.example.evstation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat

class calc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)


        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val perText = findViewById<EditText>(R.id.editTextpercentage).text.toString()
            val capText = findViewById<EditText>(R.id.editTextsize).text.toString()
            val rateText = findViewById<EditText>(R.id.editTextconsumption).text.toString()

            // Convert input strings to Doubles
            val per = perText.toDoubleOrNull() ?: 0.0
            val cap = capText.toDoubleOrNull() ?: 0.0
            val rate = rateText.toDoubleOrNull() ?: 0.0

            var rangeeee = 0.0
            if (rate != 0.0) {
                rangeeee = ((per / 100) * cap) / rate
            }


            val intent = Intent(this, range::class.java)
            intent.putExtra("rangee", rangeeee)
            startActivity(intent)

        }
    }
}