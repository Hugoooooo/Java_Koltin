package com.hugo.student.kotin

import java.util.*

fun main(args: Array<String>) {

    StudentKTT.pass = 50;
    GraduateStudent.pass = 80;
    var student = StudentKTT("Hugo",78f,60f);
    var graduateStudent = GraduateStudent("Ben",80f,60f,70f);
    student.Print();
    graduateStudent.Print();
//    ScannerQ()
}

private fun ScannerQ() {
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


class  GraduateStudent(name: String,math: Float,english: Float,var thesis : Float) : StudentKTT(name,math,english){
    companion object {
        var pass : Int = 60;
    }

    override fun Print() {
        var  IsPass : String;
        if(Average()> pass)
            IsPass = "Pass";
        else
            IsPass = "Falied";
        println("$name\t$math\t$english\t$thesis\tAvg:${Average()}\t${HighScore()}\tLevel:${Grade()}\t是否通過:$IsPass")
    }

    override fun Average(): Float= (math + english + thesis) / 3;
}

open class StudentKTT(var name: String, var math: Float, var english: Float) {
    companion object {
        var pass  : Int = 40;
    }
    open fun Print() {
        var  IsPass : String;
        if(Average()> pass)
            IsPass = "Pass";
        else
            IsPass = "Falied";
        println("$name\t$math\t$english\tAvg:${Average()}\t${HighScore()}\tLevel:${Grade()}\t是否通過:$IsPass")
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

    open fun Average() = (math + english) / 2;
}