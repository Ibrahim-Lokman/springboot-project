package com.ibrahim.springboot.thymeleafdemo.controller;

import com.ibrahim.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${programmingLanguage}")
    private List<String> programmingLanguage;

    @Value("${operatingSystems}")
    private List<String> operatingSystems;
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {
        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("countries", countries);
        theModel.addAttribute("programmingLanguage", programmingLanguage);
        theModel.addAttribute("operatingSystems", operatingSystems);
        return  "student-form";
    }
    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student thestudent) {


        return "student-confirmation";
    }

}
