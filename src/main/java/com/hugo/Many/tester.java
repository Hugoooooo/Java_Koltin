package com.hugo.Many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tester {

    public static void main(String[] args) {
//        ArrayList();
//        List();
    }

    private static void List() {
        List<Integer> tt = Arrays.asList(9,8,6,5,4,3,2);
        System.out.println(tt);
        for(int t : tt)
        {
            System.out.println(t);
        }
    }

    private static void ArrayList() {
        ArrayList<Integer> li =new ArrayList<Integer>();
        li.add(9);
        li.add(2);
        li.add(7);
        System.out.println(li);
        System.out.println(li.get(2));
    }

}
