package com.hugo

fun main(args: Array<String>) {
//    println("Hello Kotlin");
//    Human().hello();
    var h = Human();
    h.hello();
    var a : Int = 123;

    println(a);

}


class  Human(){
    fun hello(){
        println("Hello Kotlin!");
    }
}