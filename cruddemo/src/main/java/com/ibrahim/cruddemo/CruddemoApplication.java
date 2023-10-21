package com.ibrahim.cruddemo;

import com.ibrahim.cruddemo.dao.StudentDAO;
import com.ibrahim.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        System.out.println("Main Start");
        SpringApplication.run(CruddemoApplication.class, args);
        System.out.println("Main End");
    }


    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        System.out.println("commandLineRunner start.");
        return runner -> {
            System.out.println("runner start.");
//            createStudent(studentDAO);
            readStudent(studentDAO);
            System.out.println("runner end.");
        };

    }

    private void readStudent(StudentDAO studentDAO) {
        Student tempStudent = new Student("Sajeet read", "Ibrahim read", "sajeetread@ibrahim.com");
        studentDAO.save(tempStudent);
        Student myStudent = studentDAO.findById(tempStudent.getId());
        System.out.println("Found student = " + myStudent);
    }

    private void createStudent(StudentDAO studentDAO) {

        Student tempStudent = new Student("Sajeet 2", "Ibrahim 2", "sajeet2@ibrahim2.com");

        studentDAO.save(tempStudent);

    }

}
