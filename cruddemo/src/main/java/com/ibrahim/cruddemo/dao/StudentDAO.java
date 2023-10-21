package com.ibrahim.cruddemo.dao;

import com.ibrahim.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findALl();
}
