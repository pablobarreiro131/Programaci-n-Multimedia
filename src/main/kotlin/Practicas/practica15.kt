package Practicas

import kotlin.math.pow

interface Figura {
    fun calcularPerimetro(): Double
    fun calcularSuperficie(): Double
    fun tituloResultado() {
        println("Datos de la figura:")
    }
}

class Cuadrado(val a: Double) : Figura {
    override fun calcularPerimetro(): Double = 4 * a
    override fun calcularSuperficie(): Double = a.pow(2)
    override fun tituloResultado() {
        println("Datos del cuadrado:")
    }
}

class Rectangulo(val a: Double, val b: Double) : Figura {
    override fun calcularPerimetro(): Double = 2 * a + 2 * b
    override fun calcularSuperficie(): Double = a * b
    override fun tituloResultado() {
        println("Datos del rectangulo:")
    }
}

class Circulo(val r: Double) : Figura {
    override fun calcularPerimetro(): Double = 2 * r * Math.PI
    override fun calcularSuperficie(): Double = Math.PI * r.pow(2)
    override fun tituloResultado() {
        println("Datos del circulo:")
    }

}

fun main() {
    val cuadrado1 = Cuadrado(10.0)
    cuadrado1.tituloResultado()
    println("Perímetro del cuadrado : ${cuadrado1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${cuadrado1.calcularSuperficie()}")

    val rectangulo1 = Rectangulo(10.0, 5.0)
    rectangulo1.tituloResultado()
    println("Perímetro del rectángulo : ${rectangulo1.calcularPerimetro()}")
    println("Superficie del rectángulo : ${rectangulo1.calcularSuperficie()}")

    val circulo1 = Circulo(5.0)
    circulo1.tituloResultado()
    println("Perímetro del circulo: ${circulo1.calcularPerimetro()}")
    println("Superficie del circulo : ${circulo1.calcularSuperficie()}")
}