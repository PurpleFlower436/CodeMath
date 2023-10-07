package com.example.codemath

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val numberInput1EditText = findViewById<EditText>(R.id.number_input1)

        val numberInput2EditText = findViewById<EditText>(R.id.number_input2)



    }


}