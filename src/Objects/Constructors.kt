package Kotlin101.Objects.Constructors

class Primary (initialName : String, age : Int = 30){
    var firstName = initialName
    val age = age
    {
        //this is an anonymous constructor
        //there is no other type of constructor

        firstName += ".jr"
    }
    public fun sayName(){
        println("My name is $firstName and I am $age years old.")
    }
}

fun main(args : Array<String>) {
    var p = Primary("John Adams", 56)
    p.sayName()

    var n = Primary("Bon Jovi")
    n.sayName()
}
