package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wtf ="Y";
        while (1==1){
            BuyTicket();
            System.out.println("詢問還需要繼續購票嗎?(Y/N) ");
            wtf = scanner.next();
            if(wtf.equals("N")){
                break;
            }
            System.out.println(wtf);
        }
    }

    private static void BuyTicket() {
        int sCount = 0;
        int rCount = 0;
        int total = 0;
        Ticket ticket = new Ticket(1000, 2000, 0.9f);
        Scanner scanner = new Scanner(System.in);
        System.out.println("詢問要購買張數?");
        sCount = scanner.nextInt();
        System.out.println("詢問要購買幾張來回票?");
        rCount = scanner.nextInt();
        total = ticket.CalcTotal(sCount, rCount);
        System.out.println("Total Tickets : " + sCount);
        System.out.println("Round-Trip Tickets : " + rCount);
        System.out.println("Total : " + total);
    }
}
