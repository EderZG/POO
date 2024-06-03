package com.example.poo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    object fernanda{
        var apodo = "fer"
        fun saludo(){println("Hola, me llaman $apodo")}
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var sc = Subclasses()
        println(sc.presentar())

        var ani = Subclasses.Anidada()
        println(ani.presentar())

        var inn = Subclasses().Interna()
        println(inn.presentar())

        println(fernanda.saludo())
        fernanda.apodo = "SuperFer"
        println(fernanda.saludo())


        /*
        var num: Int = 0
        var jota: Person = Person(name = "jota", passport = "AHSUAD8923882")
        var anonimo: Person = Person()
        println(jota.alive)
        println(jota.name)
        println(jota.passport)

        anonimo.Person()
        anonimo.name = "Pablo"
        println(anonimo.alive)
        println(anonimo.name)
        println(anonimo.passport)

        jota.die()
        println(jota.alive)

        var pele: Athlete = Athlete("Pelé", "CSDJKF878", "Futbol")
        println(pele.alive)
        println(pele.name)
        println(pele.passport)
        println(pele.sport)

        pele.die()
        println(pele.alive)

        var bicho: Pokemon = Pokemon()
        println(bicho.getName())
        println(bicho.getAttackPower())
        bicho.setLife(30f)
        println(bicho.getLife())
        */

    }
}