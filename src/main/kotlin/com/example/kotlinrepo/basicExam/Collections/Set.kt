package com.example.kotlinrepo.basicExam.Collections

/**
 * Sets : 순서가 없고 중복이 불가능한 타입
 *  - set : read-only
 *  - mutableSet : mutable
 */
fun main() {
    //변경이 불가능한 Type (read-only)
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)      //[apple, banana, cherry]

    //변경이 가능한 Type (mutable)
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(fruit)              //[apple, banana, cherry]

    //변경이 가능한 fruit 를 변경이 불가능 하도록 변경
    val fruitLocked: Set<String> = fruit

    //count()
    println("This set has ${readOnlyFruit.count()} items")  // This set has 3 items

    //값 체크
    println("banana" in readOnlyFruit)     //true
    println("watermelon" in readOnlyFruit) //false

    //add(), remove()
    fruit.add("watermelon")
    println("watermelon" in fruit) //true

    fruit.remove("watermelon")
    println("watermelon" in fruit) //false
}