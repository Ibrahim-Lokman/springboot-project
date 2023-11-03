package com.ibrahim.springboot.springbootcruddemo.rest;

import com.ibrahim.springboot.springbootcruddemo.dao.EmployeeDAO;
import com.ibrahim.springboot.springbootcruddemo.entity.Employee;
import com.ibrahim.springboot.springbootcruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
