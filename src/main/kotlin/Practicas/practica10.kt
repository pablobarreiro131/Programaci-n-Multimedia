package Practicas

fun main() {
    val calculadora = CalculadoraCuerpoExpresion()
    println(calculadora.sumar(1,2))
    println(calculadora.restar(1,2))
    println(calculadora.multiplicar(1,2))
    println(calculadora.dividir(1,2))
    calculadora.saludar("Ana")
}