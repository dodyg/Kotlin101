package Functions.SingleExpression

//we are using single expression function
//this also demonstrate the ability to have function within function
fun main(Args : Array<String>) {
    fun sayHello(name : String) = "Hello $name"

    fun triple(number : Int) = number * 3

    for (x in 1..triple(2)) //we are using a range here
        println(x.toString() + "." + sayHello("Adam"))
}