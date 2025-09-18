package Practicas

class CalculadoraCuerpoExpresion {
    fun sumar(a: Int?, b: Int?): Int = a!! + b!!
    fun restar(a: Int?, b: Int?): Int = a!! - b!!
    fun multiplicar(a: Int?, b: Int?): Int = a!! * b!!
    fun dividir(a: Int?, b: Int?): Int =
        try {
            a!! / b!!
    } catch (e: ArithmeticException){
        0
        }
    fun saludar(nombre: String) = println("Saludos Doña $nombre.")
}