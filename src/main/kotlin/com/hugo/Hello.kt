package com.hugo

fun main(args: Array<String>) {
   println("Hello Kotlin");
//    Human().hello();
    var h = Human(weight = 79f,height = 1.83f).bmi();
    println(h);

}


class  Human(var name : String ="" ,var weight : Float,var height : Float){
    init{
        println("test W : $weight  H : $height")
    }
    // 次要建構子無法使用var val
    //constructor(name : String, weight: Float,height: Float):this(weight,height);

    fun bmi() : Float {
        return weight/(height*height);
    }
}