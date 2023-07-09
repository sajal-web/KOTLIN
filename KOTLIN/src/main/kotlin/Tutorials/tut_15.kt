package Tutorials

fun main() {
    /*
        There are data types to store values but if i want to store information about
        students or car or account ? Do we have any datatype for that?

        var myCar : Car = information about car

        so to store a complex data we can define a class to store data
            In class there hava properties and methods the properties are used to store data
            and function or methods are used to perform the operations by using those data

            Classes are blueprint which say's how kind of object will prepared
     */
    // now let's create an object of person class
    val p1 = Person("Sajal",20)
    val  p2 = Person("saptarshi",12)
    println(p1.canVode())
    println(p2.canVode())
}
class  Person(val name : String, val age : Int){
    // so this methods or functions work on the basic of those properties of the class
    fun canVode() : Boolean{
        return age > 18
    }
}