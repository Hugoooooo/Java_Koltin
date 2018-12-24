package com.hugo;

public class Person {
    String name;
    float weight;
    float height;

    public Person(float weight,float height){
        this.weight = weight;
        this.height = height;
    }

    public Person(String name ,float weight,float height){
        //建構子中使用其他建構子要放在第一行
        this(weight,height);
        this.name = name;
    }
    public void hello() {
        System.out.println("Hello World!");
    }

    public float BMI() {
        return weight / (height * height);
    }
}
