package Tutorials

fun main() {
    // Classes nd Object in Kotlin
        /*
            Class is a blueprint or template
            Objects are the real things
            we create objects in our program and they interact with each other to complete the work

            // Design of a class
                1. Properties or Fields
                2. Methods (Object Does)


         */
    // now let's create a object of car class
    val mustang = car("mustang","Petrol",12345.00)
    println(mustang.price)
    println(mustang.type)
    println(mustang.name)
    mustang.applyBreak()
    mustang.driveCarr()
}
class  car(val name : String,val type : String,val price : Double, ){
    fun driveCarr(){
        println("${name} Driving the car..")
    }
    fun applyBreak(){
        println("Applied break..")
    }
}