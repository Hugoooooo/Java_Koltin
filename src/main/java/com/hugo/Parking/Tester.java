package com.hugo.Parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
//        java();
//        java8();
        LocalDateTime enter = LocalDateTime.of(2018,12,24,16,0);
        LocalDateTime leave = LocalDateTime.of(2018,12,24,18,10);
        Car car = new Car("Z151812", enter);
        car.setLeave(leave);
        long hours = (long)Math.ceil(car.getMinuteDiff()/60f);
        System.out.println(hours * 120);
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //Local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(formatter.format(now));
        System.out.println(formatter.format(now.plus(Duration.ofDays(5))));
        LocalDateTime other = LocalDateTime.of(2019, 1, 9, 00, 00);
        System.out.println(other);
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(sdf.format(date));
        String s = "2019/11/11";
        try {
            Date d = sdf.parse(s);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("----------------");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(calendar.MONTH, 9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_WEEK, 1);
        System.out.println(calendar.getTime());
    }
}
