package com.hugo.Report;

public class HealthReport implements Report {

    @Override
    public void load() {
        System.out.println("Health Report loading");
    }

    @Override
    public void print() {
        System.out.println("Health Report printing");
    }
}
