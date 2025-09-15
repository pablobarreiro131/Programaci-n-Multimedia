package Teoria

fun main() {
    val input= "y"

    when(input){
        "y" -> print("Continuando...")
        "n" -> print("Cerrando...")
        else ->  print("Entrada invalida.")
    }

    val input2 = 2
    when(input2){
        2,3,6 -> print("Te toca nocturno")
        4,5 -> print("Te toca diurno")
    }

    val input3 = 100
    when (input3) {
        Char.MAX_VALUE.toInt() -> print("Límite superior")
        Char.MIN_VALUE.toInt() -> print("Límite inferior")
        else -> print("No es ninguno de los límites")
    }

    val playerLucky = 0.2
    val bonus = 0.3
    when(val damage: Double = playerLucky + bonus){
        in 0.0..0.3 -> print("Daño recibido: ${damage*10}")
        in 0.3..0.6 -> print("Daño recibido: ${damage*20}")
        in 0.6..0.9 -> print("Daño recibido: ${damage*30}")
    }

    val markNumber = 4
    val markText = when (markNumber) {
        1 -> "Insuficiente"
        2 -> "Deficiente"
        3 -> "Aceptable"
        4 -> "Sobresaliente"
        5 -> "Excelente"
        else -> "No permitido"
    }

    print("La calificación es: $markText")

}