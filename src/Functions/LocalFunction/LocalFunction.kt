package Functions.LocalFunction


public fun main(args : Array<String>) {
    fun localFunction() {
        println("I am a local function")
    }

    //you can call a local function
    localFunction()

    fun localFunction2(func : () -> Unit) {
        func()
    }

    //you can pass a local function to a lambda parameter by using a reference to a function
    localFunction2(::localFunction)
}