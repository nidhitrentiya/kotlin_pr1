class Car(
    val type: String,
    val model: Int,
    val owner: String,
    val milesDriven: Int,
    val originalPrice: Double,
    val currentPrice: Double
) {

    init {
        println("Object of class is created and Init is called.")
    }

    fun display() {
        println("---------------")
        println("Car Information : $type, $model")
        println("Car Owner : $owner")
        println("Miles Drive : $milesDriven")
        println("Original Car Price : $originalPrice")
        println("Current Car Price : $currentPrice")
        println("---------------")
    }
}

fun main() {
    println("Creating Car Class Object car1 in next line.")
    val car1 = Car("BMW", 2018, "Aman", 105, 100000.0, 98950.0)
    car1.display()

    println()
    println("Creating Car Class Object car2 in next line.")
    val car2 = Car("BMW", 2019, "Karan", 20, 400000.0, 399800.0)
    car2.display()

    println()
    println("********** ArrayList of Car **********")

    val carList = arrayListOf<Car>()
    carList.add(Car("Toyota", 2017, "KJS", 100, 1080000.0, 1079000.0))
    carList.add(Car("Maruti", 2020, "NPP", 200, 4000000.0, 3998000.0))

    carList.forEach { it.display() }
}