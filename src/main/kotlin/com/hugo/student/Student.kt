package com.hugo.student

import java.util.*

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`);
    print("Please input your name:");
    var name = scanner.next();
    print("Please input your math score:");
    var math = scanner.nextFloat();
    print("Please input your english score:");
    var english = scanner.nextFloat();
    var stu = StudentKTT(name, math, english);
    stu.Print();
    print("High Score: ${stu.HighScore()}");
}

class StudentKTT(var name: String, var math: Float, var english: Float) {

    fun Print() {
        println("$name\t$math\t$english\tAvg:${Average()}\t${HighScore()}\tLevel:${Grade()}")
    }

    fun Grade() = when (Average()) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }

    fun HighScore() = if (math > english) {
        math
    } else {
        english
    };

    fun Average() = (math + english) / 2;
}