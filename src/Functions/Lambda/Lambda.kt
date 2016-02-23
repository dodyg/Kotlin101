package Functions.Lambda

//this is a tricky section. Pay attention

fun main(Args : Array<String>) {
    val xline : (String) -> String = { y : String -> "Full " + y }
    println("Full format function literal '${xline("Moon")}'")

    val xline2 : (String) -> String = { y -> "Short " + y }
    println("Shortened function literal '${xline2("Sticks")}'")

    doMore(xline2)
    doMore({ y -> "Literal Function " + y })

    doMore({ y ->
        var m = y + " multiline"
        m
    })

    doCalculation({
        y ->
        var m = y + 10
        m
    })
}

fun doMore(doSomething : (String) -> String) {
    println("This is from passed function '${doSomething("Great")}'")
}

fun doCalculation(calc : (Int) -> Int) {
    print("This is the result ${calc(10)}")
}
