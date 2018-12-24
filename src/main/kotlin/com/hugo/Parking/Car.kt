package com.hugo.Parking.kotlin

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    var enter= LocalDateTime.of(2018,12,24,12,0);
    var leave = LocalDateTime.of(2018,12,24,14,0);
    var car = Car("Z51812",enter);
    car.leave=leave;
    var hours = Math.ceil(car.duration()/60.0).toLong();
    print(hours);
}


class Car(var id: String, var enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if(enter.isBefore(value))
                field = value;
        }
    fun duration() = Duration.between(enter,leave).toMinutes();

}