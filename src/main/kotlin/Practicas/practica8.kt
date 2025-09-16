package Practicas

fun main() {
    print("Introduce un número entero positivo: ")
    val n: Int = readln().toInt()
    for (i in 1..n){
        if(i%3 == 0){
            continue
        }
        if (i>20){
            break
        }
        else println(i)
    }
}