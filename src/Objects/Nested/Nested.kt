package Objects.Nested

fun main(args : Array<String>) {
    var btm = Batman()
    var rbn = Batman.Robin()

    btm.say()
    rbn.say()
}

public class Batman() {
    fun say() {
        println("This is Batman")
    }

    public class Robin {
        fun say() {
            println("This is Robin")
        }
    }
}