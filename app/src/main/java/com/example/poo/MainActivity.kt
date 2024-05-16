package com.example.poo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var num: Int = 0
        var jota: Person = Person(name = "jota", passport = "AHSUAD8923882")
        var anonimo: Person = Person()
        println(jota.alive)
        println(jota.name)
        println(jota.passport)

        anonimo.Person()
        println(anonimo.alive)
        println(anonimo.name)
        println(anonimo.passport)

        jota.die()
        println(jota.alive)
    }
}