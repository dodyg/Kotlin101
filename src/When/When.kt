package When

fun main(args : Array<String>) {
    var x = 101
    val greater = { x : Int -> x > 100 }

    //This is one hell of a flexible switch statement
    when {
        x in 1..50 -> print("In range")
        greater(x) -> print("Great")
        x == 50 -> print("Exact match")
        else -> print("Outside range")
    }
}