package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.intro_button)
        button.setOnClickListener{
            Log.v("hello world", "button click")
            Toast.makeText(this, "hello world pinguin!",Toast.LENGTH_SHORT).show()
        }
    }
}