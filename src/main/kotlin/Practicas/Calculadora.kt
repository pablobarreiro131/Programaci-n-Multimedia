package Practicas

class Calculadora {

    //suma
    fun sumar(a: Int, b:  Int): Int{
        return a + b
    }

    //resta
    fun restar(a: Int, b: Int): Int{
        return a - b
    }

    //multiplicacion
    fun multiplicacion(a: Int, b:Int): Int{
        return a*b
    }

    //division
    fun division(a: Int, b:Int): Int{
        try {
            return a/b
        }
        catch (e: ArithmeticException){
            return 0
        }

    }

}