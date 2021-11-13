package com.example.ca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class RelativeLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
        val btn = findViewById<Button>(R.id.subMit)
        val group = findViewById<RadioGroup>(R.id.grp)
        val win = findViewById<RadioButton>(R.id.batch1)
        val mc = findViewById<RadioButton>(R.id.batch2)
        val lx = findViewById<RadioButton>(R.id.batch3)
        val tru = findViewById<RadioButton>(R.id.yes)
        val fals = findViewById<RadioButton>(R.id.no)

        win.setOnClickListener(){
            Toast.makeText(applicationContext,  "You are using Windows Laptop", Toast.LENGTH_SHORT).show()
        }
        mc.setOnClickListener(){
            Toast.makeText(applicationContext,  "You are using Mac Laptop", Toast.LENGTH_SHORT).show()
        }
        lx.setOnClickListener(){
            Toast.makeText(applicationContext,  "You are using Linux Laptop", Toast.LENGTH_SHORT).show()
        }
        tru.setOnClickListener(){
            Toast.makeText(applicationContext, "You are using mobile as Emulator",
                Toast.LENGTH_SHORT
            ).show()
        }
        fals.setOnClickListener(){
            Toast.makeText(applicationContext,  "You are not using mobile as Emulator ",
                Toast.LENGTH_SHORT
            ).show()
        }

        btn.setOnClickListener(){

            val intent = Intent(this,SecondRelativeLayout::class.java)
            startActivity(intent)
        }
    }
}