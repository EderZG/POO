package com.example.poo
open class Deportista (var name: String = "Eder", var estatura: Float = 1.70f, var peso: Float = 70f, var edad: Int = 20){
    fun Descanso(){println("Descanzo")}
}

class Runner(name: String,estatura: Float,peso: Float,edad: Int,var estilo : String = "100m Lisos", var velocidad : String = "100m/s" ):Deportista(name,estatura,peso, edad){
    fun Corredor () {println("El Runner $name con $estatura m de estatura, con $peso kg, de $edad años de edad, nada con estilo $estilo, a una velocidad de $velocidad")}
    fun Competir(){println("Voy a correr!!!")}
}
class Ciclista(name: String,estatura: Float,peso: Float,edad: Int,var tipo_bici : String = "Montaña", var velocidad : String = "500m/s" ):Deportista(name,estatura,peso, edad){
        fun Pedalear () {println("El Ciclista $name con $estatura m de estatura, con $peso kg, de $edad años de edad, nada con estilo $tipo_bici, a una velocidad de $velocidad")}
    fun Competir(){println("Voy a pedalear!!!")}
}
class Nadador(name: String,estatura: Float,peso: Float,edad: Int,var estilo : String = "Mariposa", var velocidad : String = "50m/s" ):Deportista(name,estatura,peso, edad){
    fun Nadar () {println("El Nadador $name con $estatura m de estatura, con $peso kg, de $edad años de edad, nada con estilo $estilo, a una velocidad de $velocidad")}
    fun Competir(){println("Voy a nadar!!!")}
}
interface Correr{
    var estilo: String
    var velocidadcorrer: Int
    fun CorrerTriatleta()
    {
        println("Corriendo")
    }
}

interface Bici{
    var tipobici: String
    var velocidadbici: Int
    fun PedalearTriatleta()
    {
        println("Pedaleando")
    }
}
interface Nadar{
    var estilo: String
    var velocidadnado: Int
    fun NadarTriatleta()
    {
        println("Nadando")
    }
}
class Triatleta(name: String, estatura: Float, peso: Float, edad: Int, override var estilo: String, override var tipobici: String,
                override var velocidadcorrer: Int, override var velocidadbici: Int,
                override var velocidadnado: Int):Deportista(name,estatura,peso, edad),Correr,Bici,Nadar{
                    override fun NadarTriatleta()
                    {
                        println("El triatleta $name con $estatura m de estatura, con $peso kg, de $edad años de edad, nada con estilo $estilo, a una velocidad de $velocidadnado")

                    }
                    override fun CorrerTriatleta()
                    {
                        println("El triatleta $name con $estatura m de estatura, con $peso kg, de $edad años de edad, corre con estilo $estilo, a una velocidad de $velocidadcorrer")
                    }
                    override fun PedalearTriatleta()
                    {
                        println("El triatleta $name con $estatura m de estatura, con $peso kg, de $edad años de edad, pedalea una bici $tipobici, a una velocidad de $velocidadbici")
                    }
}