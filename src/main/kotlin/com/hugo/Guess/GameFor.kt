package com.hugo.Guess

import java.util.*

fun main(args: Array<String>) {
    val secrect = Random().nextInt(10)+1;
    for (i in 1..4){
        var answer = Scanner(System.`in`).nextInt();
        println("第${i}次輸入:$answer");
        if(answer == secrect){
            println("Congratuation the answer is : $answer");
            break;
        }
    }

}