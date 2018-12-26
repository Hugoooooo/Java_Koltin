package com.hugo.student;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {

        Student.pass =50;
        GraduateStudent.pass =60;
        Student student = new Student("Hugo",78,52);
        GraduateStudent graduateStudent = new GraduateStudent("Ben",60,60,30);
        student.Print();
        graduateStudent.Print();
        //        ScannerQ();
    }

    private static void ScannerQ() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Plz input name : ");
        String name = scanner.next();
        System.out.print("Plz input math score : ");
        int math = scanner.nextInt();
        System.out.print("Plz input english score : ");
        int english = scanner.nextInt();
        Student s = new Student(name,math,english);
        s.Print();
    }
}

