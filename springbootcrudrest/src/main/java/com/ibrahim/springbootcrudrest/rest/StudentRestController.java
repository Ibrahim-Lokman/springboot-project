package com.ibrahim.springbootcrudrest.rest;

import com.ibrahim.springbootcrudrest.CustomExceptions.StudentNotFoundException;
import com.ibrahim.springbootcrudrest.entity.Student;
import com.ibrahim.springbootcrudrest.entity.StudentErrorResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> theStudents;

    @PostConstruct
    public void loadData() {
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
    public List<Student> getStudents() {
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if ((studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return theStudents.get(studentId);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


}
