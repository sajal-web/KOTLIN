package Tutorials

fun main() {
    /*
        Constructors - Primary and secondary constructor
        Classes has 2 things - properties and methods
            Initialize object and provide default values to properties
           so constructor is which wherewe set default values to our function


           in the constructor if we use val/var then it will be a property otherwise it will be a parameater
     */


    // Let's create a object of automobile class
    val car = Automobile("car1","4 wheeler",6,true)
    // That's how we create an object of a class where we give default values to the properties
    val  p1 = Person2("Sajal",2)
    println(p1.canVote)
}
class  Automobile(val name : String, val tyres : String, val maxSeating : Int , isAirbags : Boolean){// this is primary constructor
    var airBags = isAirbags
    fun drive(){}
    fun applyBreak(){}
}
class Person1{}

class Person2(nameParam : String,ageParam : Int){
    var name  = nameParam

    var age = ageParam

    var canVote = ageParam>18
}