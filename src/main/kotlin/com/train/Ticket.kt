package com.train.kotlin

import java.util.*

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`);

    while (1==1){
        BuyTicket();
        println("詢問還需要繼續購票嗎? ");
        if(scanner.next()=="-1")
            break;
    }


}

private fun BuyTicket(): Scanner {
    var sCount: Int;
    var rCount: Int;
    var total: Int;
    var ticket = Ticket(1000, 2000, 0.9f);
    var scanner = Scanner(System.`in`);
    println("詢問要購買張數?");
    sCount = scanner.nextInt();
    println("詢問要購買來回票?");
    rCount = scanner.nextInt();
    total = ticket.CalcTotal(sCount, rCount);
    println("Total Tickets : $sCount");
    println("Round-Trip Tickets : $rCount");
    println("Total : $total")
    return scanner
}


class Ticket (val single: Int, val round: Int, val discount: Float) {
    fun CalcTotal( tCount: Int,  rCount: Int) : Int{
        val rTotal = Math.round(rCount * (round * discount))
        val sTotal = (tCount - rCount) * single
        return sTotal + rTotal

    }
}


