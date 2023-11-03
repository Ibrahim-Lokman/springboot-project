package com.ibrahim.springbootcrudrest.rest;

import com.ibrahim.springbootcrudrest.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> theStudents;
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("John", "Sajeet"));
        theStudents.add(new Student("Jane", "Smith"));
        theStudents.add(new Student("Alice", "Johnson"));
        theStudents.add(new Student("Bob", "Brown"));
        theStudents.add(new Student("Emily", "Davis"));
        theStudents.add(new Student("Michael", "Wilson"));
        theStudents.add(new Student("Olivia", "Martinez"));
        theStudents.add(new Student("David", "Anderson"));
        theStudents.add(new Student("Sophia", "Taylor"));
        theStudents.add(new Student("William", "Thomas"));
    }

    @GetMapping("/students")
    public  List<Student> getStudents(){
        return theStudents;
    }
    @GetMapping("/students/{studentId}")
    public  Student getStudents(@PathVariable int studentId){
        return theStudents.get(studentId);
    }


}
