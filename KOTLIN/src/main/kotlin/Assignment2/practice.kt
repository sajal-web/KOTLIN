package Assignment2

fun main() {
    var nameLists = listOf("sajal", "saptarshi", "amisha")
    var celsiusTemp = listOf(50.0, 60.0, 80.0)
    val words = listOf("Hey", ", ", "KOTLIN", ", ", "Welcome to", " My World")
    // using map function
    // The map function is used to transfer each element in a collection into a new element based on a
    // given expression
    function1(nameLists)
    println(function2(nameLists))
    println(function3(celsiusTemp))

    // using reduce function
    // -->  the reduce function is used to combine the elements of a collection of a single element
    // It takes a initial value and a lambda function
    // lambda expression
    // val lambda1 = {x : Int, y : Int -> x+y}
    println(function4(words))
}

// Map function
fun function1(name: List<String>) {
    // Few examples of map function
    //1. Transfer string to uppercase
    val convertToUppercase = name.map { it.toUpperCase() }
    println(convertToUppercase)
    // print the string which contain "h"
    val containh = name.map { it.contains("h", ignoreCase = true) }
    println(containh)
}

fun function2(name: List<String>): List<Int> {
    // Let's print character sequence of a given string list using map function
    return name.map { it.length }
}

fun function3(celsiusTemp: List<Double>): List<Double> {

    return celsiusTemp.map { it * 1.8 + 32 }
}
    // Reduce Function
fun function4(words: List<String>): String {
    // concatenate string using reduce function
    return words.reduce { acc, words -> acc + words }


}