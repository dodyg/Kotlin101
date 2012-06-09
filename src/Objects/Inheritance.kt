package Kotlin101.Objects.Inheritance


fun main(args : Array<String>) {
    //simple final class
    var final = FinalConstruct("Andrew Sullivan")
    println("His name is ${final.name}")

    //derived class with two traits
    var less = LessFlexible("Karl Rove")
    println("His name is ${less.name}")
    less.dance()
    less.sing()

}

class FinalConstruct(var name : String){
}

open class FlexibleConstruct(var name : String){

}

trait Singing {
    fun sing(){
        println("I can sing")
    }
}

trait Dancing {
    fun dance(){
        println("I can dance")
    }
}

//You can only have one supertype but multiple traits
class LessFlexible(name : String): FlexibleConstruct(name), Singing, Dancing {

}

