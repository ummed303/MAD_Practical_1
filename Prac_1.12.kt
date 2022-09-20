fun main() {
var student1 = Student("sami") student1.info()
}

open class Person(var name: String = "X") { fun info (){
println("19012011139 \n") println(name + " is a student.")
println(name + " is currently in 3rd year of B.Tech .")
}
}

class Student(name: String): Person("Ujjawal Patel") {

}
