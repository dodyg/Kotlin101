package Kotlin101.Collections.HashMaps

fun main (args : Array<String>){
    val dict = hashMap (
        "adam" to "Illionis",
        "bryan" to "Alabama",
        "cain" to "Oklahoma"
    )

    println("Current location ${dict["adam"]}")

    for (k in dict.keySet())
        println("Key in '$k' with value '${dict[k]}'")

    println("Looping using entrySet")

    for (n in dict.entrySet())
        println("Key ${n.getKey()} with value ${n.getValue()}")
}