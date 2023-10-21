package com.ibrahim.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("I HAVE BEEN CALLED  CricketCoach() constr.");
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("I HAVE BEEN CALLED getDailyWorkout() CricketCoach ");
        return "Practise fast bowling for 15 mins, Sajeet boss!!..";
    }
}
