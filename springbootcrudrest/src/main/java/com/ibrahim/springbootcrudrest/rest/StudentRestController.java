package com.ibrahim.springbootcrudrest.rest;

import com.ibrahim.springbootcrudrest.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {


    @GetMapping("/students")
    public  List<Student> getStudents(){
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("John", "Doe"));
        theStudents.add(new Student("Jane", "Smith"));
        theStudents.add(new Student("Alice", "Johnson"));
        theStudents.add(new Student("Bob", "Brown"));
        theStudents.add(new Student("Emily", "Davis"));
        theStudents.add(new Student("Michael", "Wilson"));
        theStudents.add(new Student("Olivia", "Martinez"));
        theStudents.add(new Student("David", "Anderson"));
        theStudents.add(new Student("Sophia", "Taylor"));
        theStudents.add(new Student("William", "Thomas"));

        return theStudents;
    }


}
