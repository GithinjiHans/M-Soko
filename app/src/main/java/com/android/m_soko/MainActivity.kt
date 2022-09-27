package com.android.m_soko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val textView: TextView = findViewById(R.id.textView)
            textView.text = "Maybe"
            Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show()
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            exitApp()
        }
    }
}
fun exitApp() {
    exitProcess(0)
}
