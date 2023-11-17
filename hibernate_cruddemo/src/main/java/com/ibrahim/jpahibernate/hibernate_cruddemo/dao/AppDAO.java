package com.ibrahim.jpahibernate.hibernate_cruddemo.dao;

import com.ibrahim.jpahibernate.hibernate_cruddemo.entity.Instructor;
import com.ibrahim.jpahibernate.hibernate_cruddemo.entity.InstructorDetail;


public interface AppDAO {

    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
