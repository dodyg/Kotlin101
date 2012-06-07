package Functions.Infix

public fun main(args : Array<String>){
   val say = "Hello " add "world"
   println(say)

   val say2 = "Hello ".add("world 2")
   println(say2)

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
