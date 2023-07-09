fun main() {
    var i: Int = 20
    println(i.div(5))
    val p = Person("sAJAL", 18)
    println(p.canVote())
}

class Person(var name: String, var age: Int) {
    fun canVote(): Boolean {
        return age > 18
    }
}
