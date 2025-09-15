package Practicas

fun main() {
    val notas = arrayOfNulls<Double>(5)
    var sumaNotas: Double = 0.0
    val promedio: Double
    val notaAlta: Double
    var notaMaxima: Double = 0.0

    for (i in 0 until notas.size){
        notas[i]= readlnOrNull()?.toDouble()?:0.0
    }
    for (i in notas.indices){
        sumaNotas += notas[i]!!
        if(notas[i]!! >notaMaxima){
            notaMaxima=notas[i]!!
        }
    }

    promedio = sumaNotas/notas.size
    println("Notas: ${notas.contentToString()}" +
            "Suma: $sumaNotas" +
            "Promedio: $promedio" +
            "Maximo: $notaMaxima"
    )

}