package com.hugo.Guess

import java.util.*


fun main(args: Array<String>) {
    val secrect = Random().nextInt(10)+1;
    print("Pla input number : ");
    var answer = Scanner(System.`in`).nextInt();
    while(answer != secrect){
        if(answer> secrect){
            println("Lower");
        }
        else if (answer < secrect){
            println("Higher");
        }
        else{
            println("Congratuation the answer is : $answer" )
        }
    }
}