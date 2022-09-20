fun main() {
  	var a = 5
    var b = 4
    println("With using third variable:")
    println("Before Swapping:")
    println("The value of a is:" + a + " and value of b is:" + b)
   
    println("After Swapping:")
    val temporary = a
    a = b
    b = temporary
    println("The value of a is:" + a + " and value of b is:" + b)
    
}
