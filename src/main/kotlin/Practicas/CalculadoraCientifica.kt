package Practicas
import kotlin.math.*
class CalculadoraCientifica(a: Double,b: Double): CalculadoraBase(a,b){
    fun cuadrado()=Math.pow(a,2.0)
    fun raizCuadrada()=Math.sqrt(a)
}