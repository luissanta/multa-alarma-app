package com.example.multaalertaapp

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import java.util.Calendar

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        val buttonCancel = findViewById<Button>(R.id.cancelButton)
        val buttonAccept = findViewById<Button>(R.id.acceptButton)
        val textInputEditText = findViewById<EditText>(R.id.dueDateText)
        val categorySelectOptions = arrayOf("SOAT", "Tecno")
        val categorySpinner = findViewById<Spinner>(R.id.categorySpinner)
        val timeSelectOptions = arrayOf("1 mes antes", "15 días antes", "5 días antes", "1 día antes")
        val timeSpinner = findViewById<Spinner>(R.id.timeSpinner)

        buttonCancel.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        buttonAccept.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        textInputEditText.setOnClickListener {
            textInputEditText.clearFocus()
            val datePickerDialog = DatePickerDialog(
                this,
                { _, year, month, dayOfMonth ->
                    val date = Calendar.getInstance()
                    date.set(year, month, dayOfMonth)

                    textInputEditText.setText(date.time.toString())
                },
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            )
            datePickerDialog.show()
        }

        val categoryAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categorySelectOptions)
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        categorySpinner.adapter = categoryAdapter
        categorySpinner.setSelection(0)
        categorySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val timeAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, timeSelectOptions)
        timeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        timeSpinner.adapter = timeAdapter
        timeSpinner.setSelection(0)
        timeSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
    }
}
