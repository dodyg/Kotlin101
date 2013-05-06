package Kotlin101.Functions.Parameters

//primitive parameters (String, Int, Float, etc) is passed by value so you cannot change the value of the passed parameter
fun primitives(name : String){
    //name = "John Adams"
}

//object references are also passed by value (which means you cannot change the object itself - check complex2 function) but since it is an object reference,
//you can change the value inside the object
fun complex(p : Person){
    p.firstName = "John"
    p.lastName = "Adams"
}


data class Person (var firstName : String, var lastName : String)
{

}

fun main (Args : Array<String>){
    var president = "JFK"
    println("President name is $president")
    primitives(president)
    println("Now the President is $president")

    var president2 = Person("John", "Kennedy")
    println("President name is ${president2.firstName} ${president2.lastName}")
    complex(president2)
    println("Now the is ${president2.firstName} ${president2.lastName}")

    var president3 = Person("John", "Kennedy")
    println("President name is ${president3.firstName} ${president3.lastName}")
}
