package com.example.kotlinrepo.basicExam

fun main(){
    // var & val
    val popcorn = 5    // val : 생성 후 변경 불가(read-only)
    var hotdog = 7     // var : 생숭 후 변경 가능(mutable)

    // popcorn = 6     // fail(read-only)
    hotdog = 8         // ok

    println (popcorn)
    println (hotdog)

    val cola: Int      // 생성 후 값을 할당 하는 방법(read-only cola)
    cola = 10          //Variable initialized

    // 출력하는 방법(String templates)
    println("There are $popcorn popcorn.")        //There are 5 popcorn.
    println("There are ${popcorn + 1} popcorn.")  //There are 6 popcorn.
    println("There are $cola cola's.")  //There are 10 cola.

    //연산자
    var customers = 8
    customers = customers + 3 // Example of addition: 11
    customers += 7            // Example of addition: 18
    customers -= 3            // Example of subtraction: 15
    customers *= 2            // Example of multiplication: 30
    customers /= 3            // Example of division: 10

    println(customers) // 10
}