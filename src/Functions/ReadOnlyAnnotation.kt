package Kotlin101.Functions.ReadOnlyAnnotation

import java.util.HashMap
import org.jetbrains.annotations.ReadOnly

//not complete yet

 fun names() : HashMap<String, String>{
    return hashMapOf(
            "John" to "Adam",
            "Bryan" to "Mana"
    )
}

fun main (Args : Array<String>) {
    val names = names()

}