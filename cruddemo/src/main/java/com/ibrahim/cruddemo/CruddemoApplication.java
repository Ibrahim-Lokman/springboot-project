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
            createStudent(studentDAO);
            System.out.println("runner end.");
        };

    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("CruddemoApplication createStudent start.");
        Student tempStudent = new Student("Sajeet", "Ibrahim", "sajeet@ibrahim.com");
        System.out.println("CruddemoApplication createStudent mid.");
        studentDAO.save(tempStudent);
        System.out.println("CruddemoApplication createStudent end.");
    }

}
