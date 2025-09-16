package Practicas

fun main() {
    val array1 = arrayOf(1,2,3,4)
    val array2 = arrayOf(5,6,7,8)
    loop@for (i in array1.indices){
        println()
        println("||||||||||||Bucle: ${i+1}||||||||||||")
        for (j in array2.indices){
            var suma = array1[i]+array2[j]
            if (suma>10){
                println("Salto")
                continue@loop
            }
            else println("Array1: ${array1[i]} Array2: ${array2[j]} Suma: $suma")
        }
    }
}