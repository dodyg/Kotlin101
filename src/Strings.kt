package Kotlin101.Strings

fun main(args : Array<String>) {
    var plato1 = "Wise men speak because they have something to say; Fools because they have to say something."

    //This is a single line string
    println("I love ancient philosophy.")

    //Use triple quote """ to go multi line. This also means that you can use double quote " freely in the string.
    //This demonstrate template expression. Pretty neat huh. You can use ${ } to show any arbitrary expression
    println("""My favorite quote is by '$plato1' although at ${plato1.length} characters long, it is not compact.
He is also a skeptic on love "${platoOnLove()}. He is wrong, love is as simple as 1 + 1 = ${1 + 1 }."
            """)
}

fun platoOnLove(): String{
    return "Love is a serious mental disease."
}