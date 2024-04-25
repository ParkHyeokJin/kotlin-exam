package com.example.kotlinrepo.basicExam.ControllerFlow

fun main() {
    BasicLoopFor()
    CollectionLoop()
    WhileLoop()
    doWhileLoop()
}

private fun BasicLoopFor() {
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }
}

private fun CollectionLoop() {
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    // Yummy, it's a carrot cake!
    // Yummy, it's a cheese cake!
    // Yummy, it's a chocolate cake!
}

private fun WhileLoop() {
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    // Eat a cake
    // Eat a cake
    // Eat a cake
}

private fun doWhileLoop(){
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
    // Eat a cake
    // Eat a cake
    // Eat a cake
    // Bake a cake
    // Bake a cake
    // Bake a cake
}