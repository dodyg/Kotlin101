package  Kotlin101.Functions.Inline


[inline]
fun sayHello(number : Int){
    println("hello world $number")
}

public fun main(args : Array<String>){
    (1..10).forEach {
        sayHello(it)
    }
}