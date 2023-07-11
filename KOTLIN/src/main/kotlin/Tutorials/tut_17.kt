package Tutorials

fun main() {

    /*
            In kotlin if we don't create a constructor when we create an object it automatically called a default
            constructor without parameters like here Calculator()
        ** main concept is when we define a class without any constructor kotlin by default add one constructor
            which is a parameterless constructor

     */

//    val obj = Calculator()
//    println(obj.add(12, 12))

    // create an object of personDetails class
    var obj1 = PersonDetails("Sajal",20)
    println(obj1.name)
    obj1.age = 21
    println(obj1.age)



}

class Calculator {

    // here now let's define a property
    lateinit var message: String
    /* So in kotlin we have to assign an initial value of any property , If we want to assign the value later there
    * is a keyword lateinit by using this keyward we can assign value later to our property -- here also have some rule
    *    to use the lateinit keyword like
    *               1. it should be var type not val
    *               2. We cant make it Int, Float, Boolean
    *               3. It helps us in runtime errors
    *
    *
    * */


    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun mul(a: Int, b: Int): Int {
        return a * b
    }
}

// Now let's go to the getter and setter method

// Let's create a class Person which have two properties name and age
class PersonDetails(name: String, age: Int) {
    var name: String = name
        get() {
            println("Getters is called")
            return field.toUpperCase()
        }
    var age: Int = age
        set(value) {
            // here we can provide any checkpoint
            if (value > 0) {
                println("Setters is called")
                field = value
            } else {
                println("Age mush be grater than 0 ")
            }
        }

}