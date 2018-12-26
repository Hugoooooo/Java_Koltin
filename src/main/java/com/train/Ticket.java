package com.train;

public class Ticket {
    private int single;
    private int round;
    private float discount;

    public Ticket(int single, int round, float discount) {
        this.single = single;
        this.round = round;
        this.discount = discount;
    }

    public int CalcTotal(int tCount,int rCount) {
        int rTotal = Math.round(rCount * (round*discount));
        int sTotal = ( tCount - rCount) * single;
        return  sTotal+rTotal;
    }


}
