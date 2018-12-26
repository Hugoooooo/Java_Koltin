package com.hugo.Report;

public class FiananceReport implements  Report {
    @Override
    public void load() {
        System.out.println("Finance Report loading");
    }

    @Override
    public void print() {
        System.out.println("Finance Report print");
    }
}
