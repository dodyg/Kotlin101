package Kotlin101.Collections.Arrays

//Array is low level data structure - only use it when you need to. Consider using ArrayList instead
fun main (args : Array<String>){
    val presidents = array(Pair("John F", "K"), Pair("Ronald", "Reagan"))

    presidents.forEach { println("${it.first} ${it.second}")}

    val numbers = array(1,2,3,4,5)

     numbers.forEach { println(it) }

    //specialized primitives arrays for performance
    val bools = booleanArray(true, false, true)
    val bytes = byteArray(1, 2)
    val ints = intArray(1,2,3)
    val floats = floatArray(1.0f, 2.0f, 3.0f)
    val doubles = doubleArray(1.0, 2.0, 3.0)
    val longs = longArray(1, 2, 3)
    val chars = charArray('1', '2', '3')
    val shorts = shortArray(1,2,3)
}
