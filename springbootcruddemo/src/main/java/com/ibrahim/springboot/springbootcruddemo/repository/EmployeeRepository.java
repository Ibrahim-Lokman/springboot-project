package com.ibrahim.springboot.springbootcruddemo.repository;

import com.ibrahim.springboot.springbootcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Spring will  provide CRUD implementation for free.
    // Exposes basic methods
    // We just need to provide Entity class name and Primary key type.
}
