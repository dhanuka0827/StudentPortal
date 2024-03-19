package com.uni.portal.dao.impl;

import com.uni.portal.dao.StudentDao;
import com.uni.portal.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Student> getStudentDetails() {

        return null;
    }
}
