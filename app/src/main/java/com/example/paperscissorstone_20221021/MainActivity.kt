package com.example.paperscissorstone_20221021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //將變數與XML元件綁定
        val ed_name = findViewById<EditText>(R.id.ed_name)
    }
}