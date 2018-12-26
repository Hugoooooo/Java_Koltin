package com.hugo.Report;

import java.util.ArrayList;
import java.util.List;

public class ReportTest {
    public static void main(String[] args) {
        List<Report> reports = new ArrayList<>();
        reports.add(new HealthReport());
        reports.add(new FiananceReport());
        for(Report report : reports){
            report.load();
            report.print();
        }
    }
}
