package Functions.TailRecursive

//make recursive functions safer (won't blow the stack)
tailrec fun loop(current : Int = 0, until : Int) {
    if (current < until) {
        print("$current ")
        loop(current + 1, until)
    }
    else
        print("Finished")
}

fun main(Args : Array<String>) {
    loop(until = 10)
}