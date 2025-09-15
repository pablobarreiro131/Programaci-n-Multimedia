package Teoria

fun main() {
    var noAceptaNull: String
    //noAceptaNull = null
    var aceptaNull : String?
    aceptaNull = null

    fun showBeastList(beasts: List<String>?){
        if (beasts!=null && beasts.isNotEmpty()){
            beasts.forEach { println(it) }
        }
    }

}