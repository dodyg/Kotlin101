package Kotlin101.Objects.Nested

//This is a neat little feature being able to automatically assign an object to handle any trait

fun main(args : Array<String>) {
    var btm = Batman()
    var rbn = btm.Robin()

    btm.say()
    rbn.say()

}


public class Batman(){
    fun say(){
        println("This is Batman")
    }

    public class Robin{
        fun say(){
            println("This is Robin")
        }
    }
}