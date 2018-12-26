package com.hugo.student;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 70;
    public GraduateStudent(String name, int math, int english,int thesis) {
        super(name, math, english);
        this.thesis = thesis;
    }


    @Override
    public void Print() {
        System.out.println("GraduateStudent");
        int average = Average();
        System.out.println(this.name + "\t" + this.math + "\t" + this.english + "\t" +this.thesis + "\t" + average + "\t");
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


    @Override
    public int Average() {
            return (math + english + thesis) / 3;
    }

}
