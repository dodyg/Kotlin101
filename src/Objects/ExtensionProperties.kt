package Kotlin101.Objects.ExtensionProperties

val Amazing.isEmpty : Boolean
    get() = this.name.length() == 0


class Amazing(name : String){
    var name:String = name
}

fun main(args : Array<String>) {
    val italian = Amazing("Roberto")

    println("${italian.name} is  empty : ${italian.isEmpty}")
}