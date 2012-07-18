package Kotlin101.Objects.ObjectClass


fun main(args : Array<String>) {

    val espana = Matador("Emilio")

    Matador.show(espana)

    //you can also assign class object to a variable and use it later
    val m = Matador
    println("Typeof " + m)
    m.show(espana)


    //how do you pass it to a parameter
}


class Matador(name : String){
    private val name : String = name

    private fun myPrivateShow(){
        println("This is ${name} private show")
    }

    class object{
        fun show(mt : Matador){
            //function inside a class object can access private properties and function of the class
            println ("Expose the private secret of ${mt.name}")
            mt.myPrivateShow()
        }
    }
}