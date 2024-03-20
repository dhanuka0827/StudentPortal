package com.uni.portal.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uni.portal.dao.StudentDao;
import com.uni.portal.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<Student> getStudentDetails() {
    	TypedQuery<Student> query = entityManager.createQuery("SELECT t FROM Student t", Student.class);
        return query.getResultList();
    }
}
/*
 * Session session=sessionFactory.openSession();
    	session.beginTransaction();
    	Student stud=new Student();
    	session.load(stud, id);
 */