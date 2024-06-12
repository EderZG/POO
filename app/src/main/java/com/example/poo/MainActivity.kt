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

        var sol : star = star("Sol",696340f,"Via lactea")
        println(sol)

        var hoy:dias = dias.LUNES
        var semana = dias.values()
        for (i in semana) println(i)

        println(dias.valueOf("MIERCOLES"))
        println(hoy.name)
        println(hoy.ordinal)

        println(hoy.saludo())
        println(hoy.laboral)
        println(hoy.jornada)
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
        var corredorPedro: Runner = Runner("Pedro García", 1.60f, 65f, 16, "Maratón", "100")
        var juanCiclista : Ciclista = Ciclista("Juan Ayuso", 1.54f, 75f, 17,"bici de carretera", "600")
        var davidMeca: Nadador = Nadador("David Meca", 1.80f, 77f, 18,"mariposa", "60")
        // Mostramos corredor
        println(corredorPedro.Corredor())
        println(corredorPedro.Descanso())
        // Mostramos ciclista
        println(juanCiclista.Pedalear())
        println(juanCiclista.Descanso())
        // Mostramos nadador
        println(davidMeca.Nadar())
        println("-----------------------")
        // Los ponemos a descansar
        println(davidMeca.Descanso())

        // Triatleta
        var triatleta: Triatleta = Triatleta("Eder",1.70f, 70f, 20, "100 metros lisos", "bici de montaña",150,200,100)
        println(triatleta.NadarTriatleta())
        println(triatleta.PedalearTriatleta())
        println(triatleta.CorrerTriatleta())
        println(triatleta.Descanso())

    }
}