package com.hugo.Parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private  String id;
    private LocalDateTime enter;
    private  LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public void setLeave(LocalDateTime leave){
        if(leave.isAfter(this.enter)){
            this.leave = leave;
        }
    }

    public long getMinuteDiff(){
        Duration duration = Duration.between(enter,leave);
        return  duration.toMinutes();
    }

}
