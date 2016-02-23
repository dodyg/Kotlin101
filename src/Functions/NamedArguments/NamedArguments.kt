package Functions.NamedArguments

fun superHeroCapabilities(
        name : String,
        fly : Boolean = false,
        swim : Boolean = false,
        punch : Boolean = true
) {

    if (fly)
        print ("$name can fly ")
    else
        print ("$name cannot fly ")

    if (swim)
        print (", can swim ")
    else
        print (", cannot swim ")

    if (punch)
        print ("and can punch")
    else
        print ("and cannot punch")

    println("")
}

fun main(Args : Array<String>) {
    var batman = superHeroCapabilities(name = "Batman")
    var superman = superHeroCapabilities(name = "Superman", fly = true)
    var hulk = superHeroCapabilities(name = "Hulk", punch = true)
}