package Practicas

class Coche(val marca: String, val modelo: String) {
    var velocidad: Int = 0
        private set

    constructor(marca: String, modelo: String, velocidadInicial: Int) : this(marca, modelo) {
        if (velocidad >= 0) {
            velocidad = velocidadInicial
        }
    }

    fun acelerar(cantidad: Int) {
        velocidad += cantidad
    }

    fun frenar(cantidad: Int) {
        if (velocidad < 0) {
            velocidad -= cantidad
        }

    }

}

fun main() {
    val coche = Coche("Ford", "Focus", 20)

    println("Marca: ${coche.marca}")
    println("Modelo: ${coche.modelo}")
    println("Velocidad inicial: ${coche.velocidad} km/h")

    coche.acelerar(40)
    println("Velocidad después de acelerar 40 km/h: ${coche.velocidad} km/h")

    coche.frenar(15)
    println("Velocidad después de frenar 15 km/h: ${coche.velocidad} km/h")

    // Revisar
}
