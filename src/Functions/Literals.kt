package Kotlin101.Functions.Literals

fun main (Args : Array<String>){

    //this is how to declare it and assign it to a value

    val literal : (String) -> Unit = { (x) -> println(x)}
    literal("This will be printed")

    fun show (p : (String) -> Unit){
        p("This is a function literal")
    }

    show({ x -> println(x)}) //this is a function literal - a one off function

    //you can also have a function literal without a parameter
    fun show2 (p : () -> Unit) {
        p()
    }

    show2({ println("This is a function literal without a parameter")})

    //and if the last parameter of a function is a parameter, you can pass it outside ()
    show2 { println("See, we are passing this function literal outside the ()")}
}

