package com.ibrahim.springboot.springbootcruddemo.dao;

import com.ibrahim.springboot.springbootcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
