package Kotlin101.Objects.DataClass

/* This sample demonstrates various features that you get from using a data class */

public data class Superhero(val firstName: String, val lastName: String)

fun main(args : Array<String>) {
    var superman = Superhero("clark", "kent")

    //Automatic toString generation
    println("Superman is  ${superman.toString()}")

    //Automatic hashCode
    println("Superman hashcode is ${superman.hashCode()}")

    var supermanAlias = Superhero("clark", "kent")

    //Auto generated equals
    var areTheyEqual = superman.equals(supermanAlias)
    println("Is superman equals supermanAlias? $areTheyEqual")

    //component methods are generated
    val isFirstName = superman.firstName.equals(superman.component1())
    println("is .firstName equal to .component1? $isFirstName ")

    var isLastName = superman.lastName.equals(superman.component2())
    println("is .lastName equals to .component2? $isLastName")

    //multi declarations
    val hero = { (x: Superhero) -> x}
    val(firstName, lastName ) = hero(superman)

    println("Our superhero name is $firstName $lastName")

    //another sample of multi declarations
    fun supercharge(x : Superhero) : Superhero{
        var m = Superhero(x.firstName.toUpperCase(), x.lastName.toUpperCase())
        return m
    }

    val(firstName2, lastName2) = supercharge(superman)
    println("Our supercharged superhero name is $firstName2 $lastName2")
}