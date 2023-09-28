package com.example.multaalertaapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.addButton)

        button.setOnClickListener {
            val intent = Intent(this, CreateActivity::class.java)
            startActivity(intent)
        }

        val linearLayout = findViewById<LinearLayout>(R.id.linear_layout)

        linearLayout.setOnClickListener {
            val intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }

        val linearLayout1 = findViewById<LinearLayout>(R.id.linear_layout1)

        linearLayout1.setOnClickListener {
            val intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }

        val goToShowAlarmTextView = findViewById<TextView>(R.id.go_to_show_alarm)

        goToShowAlarmTextView.setOnClickListener{

                val intent = Intent(this, ShowAlarm::class.java)
                startActivity(intent)

        }
    }
}