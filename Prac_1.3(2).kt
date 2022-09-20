fun main() {
  	var a = 5
    var b = 4
    println("Without using third variable:")
    println("Before Swapping:")
    println("The value of a is:" + a + " and value of b is:" + b)
   
    println("After Swapping:")
   	a = a - b
    b = a + b
    a = b - a
    println("The value of a is:" + a + " and value of b is:" + b)
    
}
