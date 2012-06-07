package Kotlin101.Variables


//There are two type of variable declarations in kotlin, mutable and immutable.
fun main(args : Array<String>) {
    var message = "var means a mutable variable so you can change it. "
    println("'message' variable has this value '$message'")
    message = "wallah, modified"
    println("now 'message' has this value '$message'")

    println("")
    val forever = "val means that the variable is immutable. If you try to modify this 'forever' variable, the compiler will complain."
    println(forever)
    //immutable = "oi" -- bzz, wrong!
}
