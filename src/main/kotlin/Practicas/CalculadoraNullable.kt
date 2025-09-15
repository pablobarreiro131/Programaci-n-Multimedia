package Practicas

class CalculadoraNullable {
    fun sumar(a: Int?,b: Int?):Int{
        return (a?:0) + (b?:0)
    }

    fun restar(a: Int?,b: Int?):Int{
        return (a?:0) - (b?:0)
    }

    fun multiplicacion(a: Int?,b: Int?):Int{
        return (a?:0) * (b?:0)
    }

    fun division(a: Int?,b: Int?):Int{
        try {
            return (a?:0) / (b?:0)
        }
        catch (e: ArithmeticException){
            return 0
        }

    }

}