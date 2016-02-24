package Functions.ExtensionsAsParameter

public fun main(args : Array<String>) {
    //this refers to Robot instance
    var typeA = configurator {
        this.canFight()
        this.canFly()
    }

    typeA.show()

    //if the last parameter is a function, the function literal can be passed outside the parantheses
    //'this' is also optional in any case of extension function.
    var typeB = configurator ({
        canSwim()
        canFly()
    })

    typeB.show()

    var typeC = configurator("Mayora") {
        canSwim()
    }

    typeC.show()
}

fun configurator(config : Roboto.() -> Unit) : Roboto {
    var r = Roboto()
    r.config()
    return r
}

fun configurator(name : String, config : Roboto.() -> Unit) : Roboto {
    var r = Roboto()
    r.giveName(name)
    r.config()
    return r
}

public class Roboto {
    var capabilities = ""
    var name = ""

    fun giveName(name : String) {
        this.name = name
    }

    fun canSwim() {
        capabilities += "Can Swim \n"
    }

    fun canFight() {
        capabilities += "Can Fight \n"
    }

    fun canFly() {
        capabilities += "Can Fly \n"
    }

    fun show() {
        if (name != "")
            println ("$name can $capabilities")
        else
            println (capabilities)
    }
}