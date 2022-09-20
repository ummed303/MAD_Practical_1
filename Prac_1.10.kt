fun main() {

println("Please enter the elements in Array A")

val A = Array(3) { IntArray(3) }

val B = Array(3) { IntArray(3) }

val C = Array(3) { IntArray(3) }

val D = Array(3) { IntArray(3) }

for (i in 0..2) {

for (j in 0..2) {

print("A[$i][$j]=")

A[i][j] = readLine()!!.toInt()

}

}



println("	") println("Please enter the elements in Array B")
 


for (i in 0..2) {

for (j in 0..2) { print("B[$i][$j]=")
 
print(A[i][j]) print(" ")
 
}

print("\n")

}

println("	+ ")



for (i in 0..2) {

for (j in 0..2) {

print(B[i][j])

print(" ")

}

print("\n")

}

println("	")

println("	")



for (i in 0..2) {

for (j in 0..2) {

print(C[i][j])

print(" ")

}

print("\n")

}



println("	Subtraction	") for (i in 0..2) {
for (j in 0..2) {
 
print(A[i][j]) print(" ")
}

print("\n")

}

println("	-	")

for (i in 0..2) {

for (j in 0..2) {

print(B[i][j])

print(" ")

}

print("\n")

}

println("	")

println("	")

for (i in 0..2) {

for (j in 0..2) {

print(D[i][j])

print(" ")

}

print("\n")

}

}
