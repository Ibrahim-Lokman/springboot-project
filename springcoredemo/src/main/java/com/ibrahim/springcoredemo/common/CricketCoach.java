package com.ibrahim.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @PostConstruct
    public void doMyStartupStuffCricketCoach() {
        System.out.println("doMyStartupStuffCricketCoach");
    }

    @PreDestroy
    public void doMyCleanupStuffCricketCoach() {
        System.out.println("doMyCleanupStuffCricketCoach");
    }

    @Override
    public String getDailyWorkout() {

        return "Practise fast bowling for 15 mins, Sajeet boss!!..";
    }
}
