package org.example

fun main() {
    var a = -3
    println("a=${-a}")

    val b = 10
    val c = 20
    println("$b + $c = ${b+c}")
    println("$b - $c = ${b-c}")
    println("$c / $b = ${b/c}")
    println("$b x $c = ${b*c}")
    println("$b % $c = ${b%c}")
    println("$a a ${++a}")
    println("$a a ${--a}")
}