package Collections.Arrays

//Array is low level data structure - only use it when you need to. Consider using ArrayList instead
fun main(args : Array<String>) {
    val presidents = arrayOf(Pair("John F", "K"), Pair("Ronald", "Reagan"))

    presidents.forEach { println("${it.first} ${it.second}") }

    val numbers = arrayOf(1, 2, 3, 4, 5)

    numbers.forEach { println(it) }

    //specialized primitives arrays for performance
    val bools = booleanArrayOf(true, false, true)
    val bytes = byteArrayOf(1, 2)
    val ints = intArrayOf(1, 2, 3)
    val floats = floatArrayOf(1.0f, 2.0f, 3.0f)
    val doubles = doubleArrayOf(1.0, 2.0, 3.0)
    val longs = longArrayOf(1, 2, 3)
    val chars = charArrayOf('1', '2', '3')
    val shorts = shortArrayOf(1, 2, 3)
}
