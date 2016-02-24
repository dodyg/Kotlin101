package Functions.LocalClass

fun main(Args : Array<String>) {
    class AirForce(val name : String)

    val usa = AirForce("USA")
    val india = AirForce("India")

    println("${usa.name} and ${india.name}")
}

