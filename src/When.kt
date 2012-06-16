package Kotlin101.When

fun main (args : Array<String>){
    var x = 101
    val greater = { (x : Int ) -> x > 100 }

    when {
        x in 1..50 -> print("In range")
        greater(x) -> print("Great")
        else -> print("Outside range")
    }
}