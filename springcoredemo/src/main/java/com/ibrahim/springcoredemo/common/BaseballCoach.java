package com.ibrahim.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practise batting for 5 mins, Ibrahim boss!!..";
    }
}
