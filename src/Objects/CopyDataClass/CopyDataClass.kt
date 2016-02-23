package Objects.CopyDataClass

data class Person(val firstName: String, val lastName: String){
    public fun print(){
        println("$firstName $lastName")
    }
}

fun main(args : Array<String>) {
    val presidentOne = Person("Bill", "Clinton")
    presidentOne.print()
    val presidentTwo = presidentOne.copy(firstName = "Hillary")
    presidentTwo.print()
}