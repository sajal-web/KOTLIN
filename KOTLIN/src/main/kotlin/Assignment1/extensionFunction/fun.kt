package Assignment1.extensionFunction

fun main() {
    /*
            Extension Function
                When we need to add some functionality or function to an existing class
               Here i take a example where i add a extra functionality in the String class
              here is the syntax --> fun className.functionName(){}

     */

}
fun String.getAllWords() : List<String>{

    return  this.split(" ")


    // this --> means the current reference of the string
    //                i can refer the current String using this keyword
}

