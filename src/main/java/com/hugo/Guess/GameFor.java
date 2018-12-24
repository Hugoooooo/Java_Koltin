package com.hugo.Guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secrect = random.nextInt(10) + 1;
        for (int i = 1; i <= 3; i++) {
            int answer;
            System.out.print("(" + i + "/3)Plz input your number : ");
            answer = scanner.nextInt();
            if (answer > secrect) {
                System.out.println("Lower");
            } else if (answer<secrect) {
                    System.out.println("Hight");
            }else{
                System.out.println("Congratulation Answer is :" + answer);
                break;
            }
        }
    }
}
