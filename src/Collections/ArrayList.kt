package Kotlin101.Collections.ArrayList

fun main (args : Array<String>){
    val list = arrayListOf(1,2,3)
    list.forEach { println(it) }

    val list2 = arrayListOf(Pair("Bill", "Clinton"),
            Pair("George W.", "Bush"),
            Pair ("Barack", "Obama"))

    list2.add(Pair("Hillary", "Clinton"))

    list2.forEach { println("${it.first} - ${it.second}") }

}