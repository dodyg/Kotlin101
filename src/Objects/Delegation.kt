package Kotlin101.Objects.Delegation

//This is a neat little feature being able to automatically assign an object to handle any trait

fun main(args : Array<String>) {
    var me = BruceWayne(Batman(), RichyRich())
    me.inWater()
    print("Is awesomely rich? " + me.isAwesomelyRich())
}

trait Superpower {
    fun inWater()
    fun onAir()
    fun onSoil()
}

trait Wealth {
    fun isAwesomelyRich () : Boolean
}

public class Batman() : Superpower{
    class object {
        fun create() = Batman()
    }

    override fun inWater(){
        println("Ack, cannot swim")
    }

    override fun onAir(){
        println("Requires vehicle")
    }

    override fun onSoil(){
        println("Awesome")
    }

    fun isFun() : Boolean{
        return false
    }
}

public class RichyRich : Wealth{
    override fun isAwesomelyRich(): Boolean {
        return true
    }
}

public class BruceWayne(a : Batman, b : RichyRich) : Superpower by a, Wealth by b