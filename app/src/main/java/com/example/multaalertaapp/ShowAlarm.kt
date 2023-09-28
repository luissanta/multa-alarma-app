package com.example.multaalertaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.Switch
import android.widget.Toast

class ShowAlarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_alarm)

        val switch2 = findViewById<Switch>(R.id.switch2)

        switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            showConfirmationToast("Alarma desactivada")
        }

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setOnClickListener {
            onImageClick()
        }
    }

    fun onImageClick() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        showConfirmationToast("Alarma desactivada")
    }

    fun showConfirmationToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }
}