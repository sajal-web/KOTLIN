package Tutorials

fun main() {
    val animal = "Dog"
//    if (animal == "Horse"){
//        println("Animal is Horse")
//    }else if (animal == "Cat"){
//        println("Animal is Cat")
//    }else if (animal == "Dog"){
//        println("Animal is Dog")
//    }else println("Animal is not found")


    // By using when

    when(animal){
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("Animal is not found...")
        // used to better code readability
    }
}