package com.example.kotlinrepo.basicExam.Collections

/**
 * Maps : key-value 로 구성 되어 있고 key값은 중복 불가
 *  - map : read-only
 *  - mutableMap : mutable
 */
fun main() {
    //read-only Map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)      //{apple=100, kiwi=190, orange=100}

    //mutable Map
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)              //{apple=100, kiwi=190, orange=100}

    //변경이 가능한 juiceMenu 를 변경이 불가능 하도록 변경
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    //Map 의 값에 접근 하는 방법 : juiceMenuLocked[key]
    println("The value of apple juice is: ${juiceMenuLocked["apple"]}")   // The value of apple juice is: 100

    //count()
    println("This map has ${juiceMenuLocked.count()} key-value pairs")    // This map has 3 key-value pairs

    // 값의 추가 put() 와 제거 remove()
    juiceMenu["coconut"] = 150
    println(juiceMenu)          //{apple=100, kiwi=190, orange=100, coconut=150}

    juiceMenu.remove("coconut")
    println(juiceMenu)          //{apple=100, kiwi=190, orange=100}

    //키 값 추출
    println(juiceMenu.keys)     //[apple, kiwi, orange]

    //value 값 추출
    println(juiceMenu.values)   //[100, 190, 100]

    //key & value 값 유무 체크
    println("coconut" in juiceMenu.keys)        //false
    println(100 in juiceMenu.values)            //true
}
