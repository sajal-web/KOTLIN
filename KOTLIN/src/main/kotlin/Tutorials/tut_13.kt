package Tutorials

fun main() {
    /*
        - What is an Array
            - Array is an simple Object that stores multiple values of same type
            - Fixed size
        - Use of Array
            1. If i want to store 50 fev song of a user
                - Defining 50 variables will be a mess
                - To solve this kind of problem we have Arrays
        - Syntax
            var arr = arrayOf("one", "two", "three")
     */


    // Implicit declaration
    var arr: Array<String> = arrayOf("sajal","saptarshi","amisha")
    var arr1 = arrayOf(1,2,3)

    // Explicit Declaration
    var arr2 = arrayOf<String>("ss","jj","kk")

    // Now let's print the array elements
    for (i in arr){
        println(i)
    }

     // Now if we want elements with index there have a small changes in syntax
    for ((i,e) in arr.withIndex()){
        // here i stand for the integer index and e stands for the element which will be any type like Strings,integers etc.
        println("$i index element is $e")
    }

    // Now if we want to access a specific index array element ..
        println(arr[2]) // here is the syntax -- arrayName[indexPos]
    // Another process we can get value from the array is
        println(arr.get(1)) // by using this .get(index) function we can also easily get the value of the specific index position
    // we can also set the values like this by using .set(index) function
        arr.set(1,"Sajal")
        arr[2] = "Saptarshi"
        println(arr[2])

    // if we need to print the size of the array here we have  .size
        println(arr.size) // -- 3



}