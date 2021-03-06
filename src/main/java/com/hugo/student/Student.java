package com.hugo.student;

public class Student {
    static int pass = 60;
    String name;
    int math;
    int english;

    public Student(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void Print() {
        int average = Average();
        System.out.println(this.name + "\t" + this.math + "\t" + this.english + "\t" + average + "\t");
        String group = "F";
        switch (average / 10) {
            case 9:
                group = "A";
                break;
            case 8:
                group = "B";
                break;
            case 7:
                group = "C";
                break;
            case 6:
                group = "D";
                break;
            default:
                group = "F";
                break;
        }

        if (Average() >= pass) {
            System.out.println("PASS \t" + group);
        } else {
            System.out.println("FAILED \t" + group);
        }
    }

    public int Average() {
        return (math + english) / 2;
    }

    public int HighScore() {
        return (math > english) ? math : english;
    }
}