package com.example.homeworkandriod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val count = intent.getStringExtra("Message")
        val textView = findViewById<TextView>(R.id.text)
        textView.text = count.toString()
    }
}