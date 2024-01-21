 //ps, i am keeping comments for my future references.
 
 fun main() {
    var ahmed: String? = null
    greetUser(ahmed)

    //////////////////////////////
    var address: String? = null ?: "no addrress"
    println(address)
    //////////////////////////////
    calculateArea(23,86)
    //////////////////////////////
   // var age: Int
    //age = nul-----------we are gonna fix it down with a nullable age
    var nullableAge: Int? = null 
    var nonNullableAge =25
    nullableAge = null


}

fun greetUser(name: String?){
    var nameLength = name?.length
    println("Hello, ${name ?: "Guest"}! Your name has ${nameLength ?: "unknown"} characters.")
}

fun calculateArea(width: Int?, height: Int?){
    require(width != null) { "Width can't be null" }
    require(height != null) { "Height can't be null" }

    val areaOfRec = width * height

    println("area of the rectangle is $areaOfRec")

}