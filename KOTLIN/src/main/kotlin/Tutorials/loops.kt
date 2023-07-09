package Tutorials

fun main() {
    // Execute set of statements multiple times
     var count = 5
    while (count >= 1){
        println("Heyyyyy")
        count--
    }

    var number = 10
    var index = 1
    while (index <=10){
        println("$number * $index = "+number*index)
        index++
    }

    // do while loop
    var x = 6
    do {
        println("KOTLIN")
        x++
    }while (x <= 8)
    println("Loop")
    // For Loop
    for (i in 1..5){
        println(i)
    }
    println("increment by step 2")
    // if i want to increment 2 in single loop then the code will be
    for (i in 1..5 step 2){
        println(i)
    }
    println("Using until")
    // now let's use until
    for (i in 1 until 5){
        println(i)
    }
    println("Reverse using DownTo")
    for (i in 10 downTo 1){
        println(i)
    }
    println("Print the table of 12..")
    var a = 12
    for (i in 1..10){
        // String templating
        println("$a * $i ="+a*i)
    }
}