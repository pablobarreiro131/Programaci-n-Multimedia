package Practicas

fun main() {
    val peso: Double
    val altura: Double

    print("Introduce tu peso: ")
    peso = readln().toDouble()
    print("Introduce tu altura: ")
    altura = readln().toDouble()

    val IMC = peso*Math.pow(altura,2.0)

    when(IMC){
        in 0.0..18.5 -> println("Bajo peso.")
        in 18.5..24.9 -> println("Normal")
        in 24.9..29.9 -> println("Sobrepeso")
        in 29.9..Double.MAX_VALUE -> println("Obesidad")
        else -> println("Error")
    }
}