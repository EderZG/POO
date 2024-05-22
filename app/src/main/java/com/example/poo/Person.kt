package com.example.poo

open class Person(var name: String = "anonimo", var passport: String? = null) {
    var alive: Boolean = true

    fun Person()
    {
        name = "Juan"
        passport = "DEWJFKWE22332"
    }
    fun die(){
        alive = false
    }
}
class Athlete (name: String, passport: String?, var sport: String): Person(name, passport)