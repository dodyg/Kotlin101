package Kotlin101.Functions.Closure

fun main (Args : Array<String>){
    var number = 1

    fun incrementAndShow(){
        number++
        println(number)
    }

    for(x in 1..3)
        incrementAndShow()
}
