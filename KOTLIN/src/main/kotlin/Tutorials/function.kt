package Tutorials

fun main() {
    // function is a block of code to perform certain functionality
    // it helps to reuse code
    /*
        fun methodName(parameater1, parameater2,....):ReturnType{
            Block of code
            it take some input perform some operations and produce output
            return result
            if any function have no return type it default return Unit type
        }
     */
    // Let's create a function to add two integer
    println(add(12,13))
    println(addTwo(12,12))
    println(addTwoOpt(12,12))
    // In this function we pass a default argument into the function
    printMessage()
    // important note : here in function where we define variable are called parameters and in function call where we pass the value those are arguments

}
fun add(a: Int, b: Int): Int{
    return  a + b
}
 // Inline function
fun addTwo(a: Int, b: Int ): Int = a+b
// also we optimize more
fun addTwoOpt(a:Int,b:Int) = a+b
// Default argument --> here in function parameater if no argument is passed we can pass a default argument here is the function
fun printMessage(count : Int = 2){
    for (i in 1..3){
        println(i)
    }
}