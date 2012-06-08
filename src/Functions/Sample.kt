package Functions

fun main (Args : Array<String>){
    doCalculation({
    y ->
        var m = y + 10
        m
    })
}

fun doCalculation(calc : (Int) -> Int){
    print("This is the result ${calc(10)}")
}
