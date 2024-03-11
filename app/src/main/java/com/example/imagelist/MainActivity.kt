package com.example.imagelist

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var list:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById<ListView>(R.id.listview)
        var imagel = listOf(R.drawable.pizza,R.drawable.pasta,R.drawable.burger)
        val adapter = imageAdapter(this,imagel)
        list.adapter = adapter

    }
}