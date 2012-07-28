package Kotlin101.Functions.Cascades

fun main (Args : Array<String>){
    /* This call utilizes extension function and infix call */
    var superman = Superman() with {
        name = "Lux Luthor"
        punch()
        kick()
    }
}

public fun <T>T.with(operations : T.() -> Unit) : T {
    this.operations()
    return this
}

public class Superman() {
    var name : String = "Clark Kent"

    public fun punch() : Unit = println("$name punches")
    public fun fly() : Unit = println("$name flies")
    public fun kick() : Unit = println("$name kicks")
}