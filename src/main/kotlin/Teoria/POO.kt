package Teoria

class NaveEspacial(
    var nombre: String,
    val tamano: Int
) {
    var velocidad: Int = 0

    fun volar() {
        velocidad = 11
    }

    fun estaVolando(): Boolean {
        return velocidad > 0
    }

    companion object {
        fun nuevaNave(): NaveEspacial {
            return NaveEspacial("Falcon", 25)
        }
    }
}

fun main() {
    val miNave = NaveEspacial("Enterprise", 150)
    miNave.volar()
    val volando = miNave.estaVolando()
    println("¿Está volando $volando?")
    val nuevaNave = NaveEspacial.nuevaNave()
    println("Nueva nave: ${nuevaNave.nombre}, tamaño: ${nuevaNave.tamano}")
}