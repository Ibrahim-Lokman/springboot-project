package com.ibrahim.cruddemo.daoImpl;

import com.ibrahim.cruddemo.dao.StudentDAO;
import com.ibrahim.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findALl() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName asc", Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);
        theQuery.setParameter("theData", theLastName);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);

    }
}
