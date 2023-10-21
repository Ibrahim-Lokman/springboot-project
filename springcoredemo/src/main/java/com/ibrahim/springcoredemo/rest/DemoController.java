package com.ibrahim.springcoredemo.rest;

import com.ibrahim.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    //    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }

    //    @Autowired
//    private  Coach myCoachFieldInjection;
    
    @Autowired
    public void justTest(Coach lala) {
        System.out.println("I HAVE BEEN CALLED justTest ");
    }

    @Autowired
    public void setCoach(Coach theCoach) {
        System.out.println("I HAVE BEEN CALLED setCoach ");
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        System.out.println("I HAVE BEEN CALLED getDailyWorkout() mapping ");
        return myCoach.getDailyWorkout();
    }
}
