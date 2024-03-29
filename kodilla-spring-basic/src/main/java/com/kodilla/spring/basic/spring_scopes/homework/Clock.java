package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("singleton")
public class Clock {
    private LocalTime currentTime;

    public Clock() {
        this.currentTime = LocalTime.now();
    }

    public LocalTime getCurrentTime() {
        return this.currentTime;
    }
    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
    }
}
