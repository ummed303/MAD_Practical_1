class Car(var type: String="TAXI",var price: Int=1100000, var model: Int=2016, var owner: String="Panchal"){

init {
println("This is INIT method")
}
fun getCarPrice(){
println("Car price is:$price")
}
}

fun main() {
println("This is MAIN function") val car1 = Car()

println(car1.getCarPrice())
} (car1.getCarPrice())
}
