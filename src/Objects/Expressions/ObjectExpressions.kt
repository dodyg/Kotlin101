package Objects.Expressions

fun main(args : Array<String>) {
    var alone = object {
        val name : String = "Broken Glass House"
        val address : String = "55 N. State Street, Chicago"
    }

    println ("This is the address of the event : '${alone.name}' with address '${alone.address}'")

    var killer = object : Player("John Adams") {
        override fun fight() {
            println ("$name can shoot and run")
        }
    }

    killer.fight()
}

fun anythingGoes() : Any {
    return object {
        val message : String = "You can use this anytime"
    }
}

open class Player(name : String) {
    public val name : String = name

    public open fun fight() {
        println("$name can fight.")
    }
}
