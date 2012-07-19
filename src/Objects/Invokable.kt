package Kotlin101.Objects.InvokableObjects

/* You  can use any type that has a function named invoke() in a callee position:*/

trait Superhero {
    public fun invoke()
}

class Batman : Superhero{
     override fun invoke(){
        println ("Batman punches")
    }
}

class Superman{
}

// this also works even if it's just  an extension function
fun Superman.invoke(){
    println ("Superman flies")
}

fun invoke (x : Batman){
    x()
}

fun invoke2 (x : Superhero){
    x()
}

fun invoke3 (x : Superman){
    x()
}

fun main(args : Array<String>) {
    var darkNight = Batman()
    var clark = Superman()

    invoke(darkNight)//direct type
    invoke2(darkNight)//via trait
    invoke3(clark)//via extension function
}