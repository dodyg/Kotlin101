package Objects.Traits

fun main(args : Array<String>){
    var adam = Cowboy("Adam")
    adam.does()
}

trait Shooting {
    abstract var name : String
    fun does(){
        print("$name can Shoot")
    }
}

class Cowboy (name : String): Shooting{
   override var name = name
}