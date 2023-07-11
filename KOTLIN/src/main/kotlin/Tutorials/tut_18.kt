package Tutorials
fun main() {
    val obj2 = Child()
    obj2.myMethod()
    obj2.myMethod2()

}
class tut_18 {
}
// we needto say to our parent class that we can inherit the parent class we need to use the "open" keyward
open class  Parent{
    init {
        println("Parent's constructor is called")
    }
    val name : String = " "
    fun  myMethod(){
        println("This is parent class")
    }
}
class Child : Parent(){
    init {
        println("Child constructor is called..")
    }
    // We can inherit only one class into our child class from the parent class
    val name2 : String = " "
    fun myMethod2(){
        println(" This is child class..")
    }

}
// Summary -->
    /*

        1. Code reusability
        2. open keyword ( class A:B() )
        3. Can't inherit from multiple classes
        4. Parent class constructor is called before child class constructor

     */