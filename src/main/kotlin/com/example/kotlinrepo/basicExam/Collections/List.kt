package com.example.kotlinrepo.basicExam.Collections

/**
 * Lists : 순서가 있고 중복이 가능한 타입
 *  - list : read-only
 *  - mutableList : mutable
 */
fun main(){
    // 변경이 불가능한 리스트 타입(Read only list)
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)   // [triangle, square, circle]

    // 변경이 가능한 리스트 타입
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)           // [triangle, square, circle]

    // 변경을 방지 하기 위해 readOnly 타입으로 변경해서 처리 할 수 있다.
    val shapesLocked: List<String> = shapes

    //리스트에서 값을 가져오는 방법
    // 1. list[index]
    println("first item is : ${shapesLocked[0]} ")     //first item is : triangle

    // 2. list.method() 호출 방법
    println("first item is : ${shapesLocked.first()}") //first item is : triangle
    println("last item is : ${shapesLocked.last()}") //last item is : circle

    //List Count
    println("This list has ${shapesLocked.count()} items") //This list has 3 items

    //List 아이템 확인
    println("circle" in shapesLocked) //true
    println("hexagon" in shapesLocked) //false

    //add(), remove()
    shapes.add("hexagon")
    println(shapes)                     //[triangle, square, circle, hexagon]

    shapes.remove("hexagon")
    println(shapes)                     //[triangle, square, circle]
}