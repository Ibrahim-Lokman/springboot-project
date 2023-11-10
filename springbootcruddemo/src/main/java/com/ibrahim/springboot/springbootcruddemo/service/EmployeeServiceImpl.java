package com.ibrahim.springboot.springbootcruddemo.service;

//import com.ibrahim.springboot.springbootcruddemo.dao.EmployeeDAO;

import com.ibrahim.springboot.springbootcruddemo.entity.Employee;
import com.ibrahim.springboot.springbootcruddemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);
        Employee theEmployee = null;
        if (result.isPresent()) {
            theEmployee = result.get();
        } else {
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theEmployee;
    }

    //JpaRepository provides transactional functionality
    //@Transactional
    @Override
    public Employee save(Employee theEmployee) {

        return employeeRepository.save(theEmployee);
    }

    //@Transactional
    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
        ;
    }

}
