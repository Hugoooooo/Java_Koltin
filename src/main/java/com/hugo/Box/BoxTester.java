package com.hugo.Box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
//        Box3: 長23，寬14，高13 (cm)
//        Box5: 長39.5，寬27.5，高23 (cm)
        float length,width,height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object\'s length:");
        length = scanner.nextFloat();
        System.out.print("Please enter object\'s width:");
        width = scanner.nextFloat();
        System.out.print("Please enter object\'s height:");
        height = scanner.nextFloat();

        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        System.out.println(box3.validate(length,width,height)? "Box3 可以容納" : "Box3 不可容納");
        System.out.println(box5.validate(length,width,height)? "Box5 可以容納" : "Box5 不可容納");
    }
}
