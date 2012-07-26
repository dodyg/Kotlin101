package Kotlin101.Functions.OperatorOverloading

fun main (Args : Array<String>){

    var batman = SuperPower()
    batman.say()
    +batman
    batman.say()
    -batman
    batman.say()

    var robin = SuperPower()
}

public class SuperPower(){
    var power : Int = 1
    var action = "Neutral"
    fun plus(){
        power++
        action = "+"
    }

    fun minus(){
        power--
        action = "-"
    }

    fun say(){
        println(action + " " + power)
    }

    fun toString() : String{
        return "$power"
    }
}