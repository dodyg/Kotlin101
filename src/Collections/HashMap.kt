package Kotlin101.Collections.HashMaps

fun main (args : Array<String>){
    val dict = hashMap (
        "adam" to "Illionis",
        "bryan" to "Alabama",
        "cain" to "Oklahoma"
    )

    println("Current location ${dict["adam"]}")

    //this is called multi declaration where you assign the each pair key and value to separate variables
    for ((k, v) in dict)
        println("Key in $k has value $v")

    for (k in dict.keySet())
        println("Key in '$k' with value '${dict[k]}'")

    println("Looping using entrySet")

    for (n in dict.entrySet())
        println("Key ${n.getKey()} with value ${n.getValue()}")
}