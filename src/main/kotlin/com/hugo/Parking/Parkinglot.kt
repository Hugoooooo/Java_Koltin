package com.hugo.Parking.kotlin

import java.time.LocalDateTime

fun main(args: Array<String>) {
    var parkinglot = HashMap<String,Car>();
    var enter = LocalDateTime.of(2018,12,25,8,0);
    var leave = LocalDateTime.of(2018,12,25,11,0);
    var pickCar :Car? = null;

//    CAR1
    var car :Car = Car("Z51812",enter);
    parkinglot.put(car.id,car);
    pickCar = parkinglot.get("Z51812");
    pickCar?.leave = leave;
    println("車號 ${pickCar?.id} 時間 ${pickCar?.duration()}")
    parkinglot.remove(pickCar?.id);
//    CAR2
    var car2 :Car = Car("Z51813",enter.plusHours(2));
    parkinglot.put(car2.id,car2);
    pickCar = parkinglot.get("Z51813");
    pickCar?.leave = leave;
    println("車號 ${pickCar?.id} 時間 ${pickCar?.duration()}")
    parkinglot.remove(pickCar?.id);

    println(parkinglot.size);


}