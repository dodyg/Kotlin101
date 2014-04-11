package Kotlin101.Functions.Infix

public fun main(args : Array<String>){
   //using a function
   val say = "Hello " add "world" //infix function call
   println(say)

   val say2 = "Hello ".add("world 2")
   println(say2)

   //using a method
   val hello = HelloWorld()
   var say3 = hello say "world 3"
   println(say3)

   var say4 = hello.say("world 4")
   println(say4)
}

fun String.add(more : String) : String = this + more

class HelloWorld(){
    fun say(more : String) : String{
        return "Hello " + more
    }
}
