package Functions.Inline

// You can inline functions to improve performance of your code.
// The reference says inlining works best for functions with lambda parameters.
@Suppress("NOTHING_TO_INLINE")
inline fun sayHello(number : Int) {
    println("hello world $number")
}

public fun main(args : Array<String>) {
    (1..10).forEach {
        sayHello(it)
    }
}