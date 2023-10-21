package com.ibrahim.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {


    @Override
    public String getDailyWorkout() {
    
        return "Practise fast bowling for 15 mins, Sajeet boss!!..";
    }
}
