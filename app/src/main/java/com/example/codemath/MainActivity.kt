package com.example.codemath

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val numberInput1EditText = findViewById<EditText>(R.id.number_input1)

        val numberInput2EditText = findViewById<EditText>(R.id.number_input2)

        val button: Button = findViewById<Button>(R.id.submit_button)


        val resultEditText = findViewById<TextView>(R.id.total)

        button.setOnClickListener {view ->

            val number1Text = numberInput1EditText.text.toString()
            val number2Text = numberInput2EditText.text.toString()

            if (number1Text.isNotEmpty() && number2Text.isNotEmpty()) {
                // Convert the input strings to Double (or the appropriate numerical type)
                val number1 = number1Text.toInt()
                val number2 = number2Text.toInt()

                // Calculate the total
                val total = number1 + number2

                // Display the result in the result EditText
                resultEditText.setText(total.toString())
            } else {
                // Handle the case when one or both inputs are empty
                // You can display an error message or handle it as you see fit
                // For simplicity, let's set the result EditText to "Invalid Input"
                resultEditText.setText("Invalid")
            }
        }






    }


}