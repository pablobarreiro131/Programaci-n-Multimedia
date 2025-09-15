package Teoria

fun main(){
    val planets = arrayOfNulls<String>(8)
    planets[0]="Mercurio"
    planets[1]="Venus"
    planets[2]="Tierra"
    planets[3]="Marte"
    planets[4]="Jupiter"
    planets[5]="Saturno"
    planets[6]="Urano"
    planets[7]="Neptuno"
    println("${planets.contentToString()}")

    for(i in planets.indices){
        println("${planets[i]} está en la posición ${i+1}")
    }

    for (i in 0 until planets.size) {
        println("${planets[i]} está en la posición ${i + 1}")
    }
}