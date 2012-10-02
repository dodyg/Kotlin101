package Kotlin101.Objects.Literals

//In the old days (Kotlin M2), Kotlin has tuples. They have been removed at M3. Now you can use instead Pair or Triple (they are implemented as data class)
fun main (Args : Array<String>){
    var greet = Pair("Hello", "World")
    val(word1, word2) = greet

    println("${greet.first} ${greet.second} or $word1 $word2")


    var greet2 = Triple("I", "am", 34)
    val(word3, word4, number) = greet2

    println("${greet2.first} ${greet2.second} ${greet2.third} or $word3 $word4 $number")
}