package Loops

fun main(args : Array<String>) {
    var presidents = arrayOf("jfk", "nixon", "carter")

    print("I love these presidents ")
    for (p in presidents) {
        print ("$p, ")
    }

    println("")
    print("I voted for these presidents ")
    for (p in presidents.indices) {
        print ("${presidents[p]}, ")
    }

    println("")
    print("I loath these presidents ")
    var i = presidents.size
    while (i > 0) {
        i--
        print("${presidents[i]}, ")
    }

    println("")
    print("I puzzle these presidents ")
    var q = presidents.size
    do {
        q--
        print("${presidents[q]}, ")
    }while(q > 0)
}
