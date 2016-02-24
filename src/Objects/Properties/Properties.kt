package Objects.Properties

fun main(args : Array<String>) {
    //you cannot change johnClark name. It's immutable
    var johnC = Person("John", "Clark")
    println("The name is ${johnC.firstName} ${johnC.lastName}")

    var markC = Soldier("Mark", "Chavez")
    println("The name is ${markC.firstName} ${markC.lastName}")

    var vanD = UniversalSoldier("Van", "Damme")
    println("The name is ${vanD.firstName} ${vanD.lastName}")

    var slyvesterS = UltimateSoldier("Slyvester", "Stallone")
    println("The name is ${slyvesterS.firstName} ${slyvesterS.lastName}")
}

//This will make two immutable properties
class Person(val firstName : String, val lastName : String)

//This is another way to declare the immutable properties.
class Soldier(firstName : String, lastName : String) {
    public val firstName : String = firstName
    public val lastName : String = lastName
}

//Property with backing field
//The compiler only generates a backing field if it is used by the accessors.
class UniversalSoldier(firstName : String, lastName : String) {
    public var firstName : String = firstName
        get() {
            return "Universal " + field
        }
        set(value) {
            field = value
        }

    public var lastName : String = lastName
}

//property with old java style
class UltimateSoldier(firstName : String, lastName : String) {
    private var _firstName = ""
    public var firstName : String
        get() {
            return _firstName
        }
        set(value) {
            _firstName = value
        }

    private var _lastName = ""
    public var lastName : String
        get() {
            return _lastName
        }
        set(value) {
            _lastName = value
        }

    init {
        //constructor - we cannot initialize directly to the properties because this way there is no backing field
        this.firstName = firstName
        this.lastName = lastName
    }
}