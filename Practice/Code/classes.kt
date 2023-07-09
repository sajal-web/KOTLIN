fun main() {
    var result = Car("mustang", "Petrol")
    println(result.driveCar())
}

class Car(var name: String, var type: String) {
    fun driveCar() {
        print("Driving the car")
    }
    fun applyBreak() {
        print("Applied break..")
    }
}
