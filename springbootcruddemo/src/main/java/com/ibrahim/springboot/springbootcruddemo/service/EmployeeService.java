package com.ibrahim.springboot.springbootcruddemo.service;

import com.ibrahim.springboot.springbootcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
