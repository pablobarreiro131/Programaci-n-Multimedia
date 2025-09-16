package Practicas

import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    println("Introduce las cuatro notas del alumno:")
    print("Nota 1: ")
    val nota1: Double = readln().toDouble()
    print("Nota 2: ")
    val nota2: Double = readln().toDouble()
    print("Nota 3: ")
    val nota3: Double = readln().toDouble()
    print("Nota 4: ")
    val nota4: Double = readln().toDouble()

    val promedio: Double = (nota1 + nota2 + nota3 + nota4) / 4

    when (promedio) {
        in 0.0..5.0 -> {
            println("¿El alumno se ha presentado a la recuperación? (S/N)")
            val respuesta: String = readln()
            when (respuesta.uppercase()) {
                "S" -> println("En recuperacion")
                "N" -> println("Suspenso")
            }
        }

        in 5.0..7.0 -> println("Aprobado")
        in 7.0..10.0 -> println("Notable")
        else -> println("Error.")
    }

}