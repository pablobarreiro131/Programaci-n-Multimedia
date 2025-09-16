package Practicas

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

    val respuesta = when (promedio) {
        in 0.0..5.0 -> {
            println("¿El alumno se ha presentado a la recuperación? (S/N)")
            val resp: String = readln().uppercase()
            when (resp) {
                "S" -> "En recuperacion"
                "N" -> "Suspenso"
                else -> "Error"
            }
        }

        in 5.0..7.0 -> "Aprobado"
        in 7.0..10.0 -> "Notable"
        else -> "Error."
    }
    println(respuesta)
}