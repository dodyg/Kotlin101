package Jumps

fun main(args : Array<String>) {

    printAgain@ println("print again")

    loop@ for (i in 1..50) {
        print("$i,")
        if (i == 25) {
            break@loop
        }
    }
    println("")
    println("end of line")
}