package LongLong

class Test {
    private val total : Int
        get() = 1 + 1

    fun print() {
        println(total)
    }
}

fun main(args : Array<String>) {
    val test = Test()
    test.print()
}
