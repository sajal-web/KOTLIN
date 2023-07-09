package Tutorials

import kotlin.math.pow

fun main() {
    /*
     Function Overloading
        - Same name different parameters
            - Either number of parameters are different
            - Or the type is different
     */
//    println(addition(1,2))
    println(addition(1.0,2.0))
    // Named arguments
//    println(addition(b = 3,a=2)) // by using name argument we can pass data by referencing the variable values


    // we can assign variable to our function
    var fn: (a: Double, b: Double) -> Double = ::addition
    println(fn(1.0,2.3))
    fn = ::power
    println(fn(2.0,3.0))

}
//fun addition(a : Int, b : Int) : Int{
//    return  a + b
//}
fun  addition(a : Double, b : Double) : Double{
    return  a + b
}
fun power(a : Double, b : Double) : Double{
    return a.pow(b)
}