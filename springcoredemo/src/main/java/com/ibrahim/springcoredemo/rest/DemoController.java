package com.ibrahim.springcoredemo.rest;

import com.ibrahim.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController(
            @Qualifier("customname") Coach theCoach) {
        System.out.println("theCoach = " + theCoach.getClass().getSimpleName());
        myCoach = theCoach;

    }


    @GetMapping("/workout")
    public String getDailyWorkout() {

        return myCoach.getDailyWorkout();
    }


}
