package com.example.ca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class SecondRelativeLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_relative_layout)
        val Kotlin = findViewById<CheckBox>(R.id.checkbox1)
        val Python = findViewById<CheckBox>(R.id.checkbox2)
        val Java = findViewById<CheckBox>(R.id.checkbox3)
        val Cpp = findViewById<CheckBox>(R.id.checkbox4)


        Kotlin.setOnClickListener(){
            if(Kotlin.isChecked)
            Toast.makeText(applicationContext, "Kotlin is selected", Toast.LENGTH_SHORT).show()
        }
        Python.setOnClickListener(){
            if(Python.isChecked)
            Toast.makeText(applicationContext, "Python is selected", Toast.LENGTH_SHORT).show()
        }
        Java.setOnClickListener(){
            if (Java.isChecked)
            Toast.makeText(applicationContext, "Java is selected", Toast.LENGTH_SHORT).show()
        }
        Cpp.setOnClickListener(){
            if (Cpp.isChecked)
            Toast.makeText(applicationContext,"C++ is selected", Toast.LENGTH_SHORT).show()
        }


    }
}