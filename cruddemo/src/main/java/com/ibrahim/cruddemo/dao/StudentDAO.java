package com.ibrahim.cruddemo.dao;

import com.ibrahim.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);
}
