package Functions.Extensions

fun String.glorify() {
    println("You are amazing " + this)
}

fun String.insults(count : Int) {
    println("${this}, you are ${count} times dumber than a dog")
}

public fun main(args : Array<String>) {
    "John".glorify()
    "John".insults(3)
}