package Kotlin101.Functions.ItVariable
import kotlin.*

fun main (Args : Array<String>){
    val primeNumbers = array(1,2,3,5,7,11)

    primeNumbers.forEach( {x -> println(x)})

    println("they are equivalent")

    primeNumbers.forEach ({println(it)})

}