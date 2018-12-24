package com.hugo.Guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secrect = random.nextInt(10) + 1;
        int answer;
        System.out.print("Plz input your number : ");
        answer = scanner.nextInt();
        while (answer != secrect) {
            if (answer > secrect) {
                System.out.println("Lower");
            } else {
                System.out.println("Hight");
            }
            System.out.print("Plz input your number : ");
            answer = scanner.nextInt();
        }
        System.out.println("Congratulation Answer is :" + answer);

    }

}
