package com.example.poo

class Person(var name: String = "anonimo", var passport: String? = null) {
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