package com.example.aboutme2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btndone: Button = findViewById(R.id.done_button)
        btndone.setOnClickListener(){
            val tvInput: TextView = findViewById(R.id.nickname_edit)
            val tvResult: TextView = findViewById(R.id.nickname_text)
            tvResult.text = tvInput.text
            tvResult.visibility = View.VISIBLE
            btndone.visibility = View.GONE
            tvInput.visibility = View.GONE
        }
    }
}