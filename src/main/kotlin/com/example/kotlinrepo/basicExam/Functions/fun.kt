package com.example.kotlinrepo.basicExam.Functions

fun main() {
    hello() // Hello, world!
    sum(5, 6)   //11

    //매개변수 명을 명시 함으로 코드 가독성을 높힌다.
    namedArguments(name = "test", company = "kotlin")

    //기본 생성자를 통해 값을 할당 할 수 있다
    defaultParameterValues(name = "test", company = "kotlin")                       //[profile] name : test, company : kotlin
    defaultParameterValues(name = "test", company = "kotlin", prefix = "resume")    //[resume] name : test, company : kotlin

    //단일 표현식 함수
    sum2(5, 6)  //11

    //lambda 표현식
    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("hello kotlin.")) // HELLO KOTLIN.

    //lambda 를 활용한 filter
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)  // [1, 3, 5]
    println(negatives)  // [-2, -4, -6]

    //lambda 를 활용한 계산 map 활용
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubled)  // [2, -4, 6, -8, 10, -12]
    println(tripled)  // [3, -6, 9, -12, 15, -18]

    //Lamda 를 활용한 리턴 타입 함수
    val hour = 5
    val convertHourToSeconds = toSeconds("hour")
    println(convertHourToSeconds(hour)) //18000
}

fun hello() {
    return println("Hello, world!")
}

// 매개변수는 () 에 작성
// 리턴 타입은 : Int
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun namedArguments(name: String, company: String) {
    println("name : $name, company : $company")
}

fun defaultParameterValues(name: String, company: String, prefix: String = "profile"){
    println("[$prefix] name : $name, company : $company")
}

fun sum2(x: Int, y: Int) = x + y


fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}