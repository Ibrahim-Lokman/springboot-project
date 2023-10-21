package com.ibrahim.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        System.out.println("I HAVE BEEN CALLED getDailyWorkout() BaseballCoach ");
        return "Practise batting for 5 mins, Ibrahim boss!!..";
    }
}
