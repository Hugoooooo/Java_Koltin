package com.hugo;

import com.hugo.student.Student;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Person p = new Person("Hugo",79f,1.83f);
        float bmival = p.BMI();
        System.out.println(p.name + " BMI is " + bmival);

    }
}

