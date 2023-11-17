package com.ibrahim.jpahibernate.hibernate_cruddemo.dao;

import com.ibrahim.jpahibernate.hibernate_cruddemo.entity.Instructor;


public interface AppDAO {

    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
}
