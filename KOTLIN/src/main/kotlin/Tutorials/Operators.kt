package Tutorials

fun main() {
    var i: Int = 13
    var j: Int = 2

    // Maths
//    println(i + j) // 9
//    println(i - j) // -1
//    println(i * j) // 20
//    println(i.toDouble() / j) // 0

    // Modular operator --> it return remainder
//    println(i % j)

    // Relational Operator
    // 1. Grater than >
//    println(i > j) // yes --> true
    // 2. Less than <
//    println(i < j) // no --> false
    // 3. Grater than equal to >=
//    println(i >= j) // yes --> true
    // 4. Less than equal to <=
//    println(i <= j) // no --> false
    // 5. Equals (==) - Double equal vs single equal
//    println(i == j) // no --> false
    //  i = j
//    println(i) // assign the value of j into i
    // 6. Not equal (!=)
//    println(i != j) // yes --> true

    // Pre / Post Increment
    // pre ++i --> in pre increment first increase the value by  one and then use
    // println(++i)

    // post i++ -- > in post increment first use the value then it increment
    // println(i++)
    // similarly decrement operator
    // println(j--)
    // println(--j)

    // Logical Operator

        // logical and && operator
    var above70 = true
    var knowsProgramming = true
    var isCallForInterviewAnd = above70 && knowsProgramming
    println(isCallForInterviewAnd)
        // logical or || operator
    var isCallForInterviewOr = above70 || knowsProgramming
    println(isCallForInterviewOr)
        // logical not ! operator
    var isCallForInterviewNot = !above70
    println(isCallForInterviewNot)

}