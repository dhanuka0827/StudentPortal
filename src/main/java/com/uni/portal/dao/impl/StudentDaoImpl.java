package com.uni.portal.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Student> getStudentDetails() {
		TypedQuery<Student> query = entityManager.createQuery("SELECT t FROM Student t", Student.class);
		return query.getResultList();
	}

	public Student loadStudent(int student) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Student stud = new Student();
		session.load(stud, student);
		session.close();
		return stud;
	}
}