package com.ibrahim.springboot.thymeleafdemo.controller;

import com.ibrahim.springboot.thymeleafdemo.entity.Employee;
import com.ibrahim.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        List<Employee> theEmployees = employeeService.findAll();
        System.out.println("theEmployees = " + theEmployees);
        theModel.addAttribute("employees", theEmployees);
        return "list-employees";
    }

}
