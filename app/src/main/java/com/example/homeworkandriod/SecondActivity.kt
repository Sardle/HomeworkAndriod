package com.example.homeworkandriod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
    }

    override fun onStop() {
        super.onStop()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("Message", "Happy new year")
        startActivity(intent)
    }
}