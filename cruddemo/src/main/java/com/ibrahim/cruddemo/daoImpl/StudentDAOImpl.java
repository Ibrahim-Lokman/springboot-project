package com.ibrahim.cruddemo.daoImpl;

import com.ibrahim.cruddemo.dao.StudentDAO;
import com.ibrahim.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        System.out.println("StudentDAOImpl  const. start");
        this.entityManager = entityManager;
        System.out.println("StudentDAOImpl  const. end");
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        System.out.println("StudentDAOImpl save start.");
        entityManager.persist(theStudent);
        System.out.println("StudentDAOImpl save end.");
    }
}
