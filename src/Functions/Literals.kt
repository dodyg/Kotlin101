package Kotlin101.Functions.Literals

fun main (Args : Array<String>){

    //this is how to declare it and assign it to a value - since the type is specified, you can omit the type declration in the implementation
    val literal : (String) -> Unit = { (x) -> println(x)}
    literal("This will be printed")

    //A statement literal - notice you have to declare the type of the parameter
    val literal2 = { (x : String) -> println(x.toUpperCase())}
    literal2("This is all uppercase now")

    //A function literal  - notice you have to declare the tyep of the parameter but you can omit the return type
    var literal3 = { (x : String) -> x.toLowerCase()}
    var lowercases = literal3("THIS IS ALL LOWERCASE NOW")
    println("$lowercases")

    //A function literal that uses multiple lines
    var literal4 = { (x : String) ->
        var y = "Multiple lines: " + x
        y //you have put the variable to be returned since return keyword is not allowed here
    }

    var text = literal4("What a wonderful world")
    println("$text")

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

