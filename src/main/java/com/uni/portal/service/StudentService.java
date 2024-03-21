package com.uni.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.portal.dao.StudentRepository;
import com.uni.portal.dao.impl.StudentDaoImpl;
import com.uni.portal.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	StudentDaoImpl studentDaoImpl;

	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public Student getById(int id) {
		return studentRepository.findById(id).orElse(null);
	}

	public List<Student> getByQuery() {
		return studentDaoImpl.getStudentDetails();
	}

	public Student getByLoadMethod(int id) {
		return studentDaoImpl.loadStudent(id);
	}

	public List<Student> getAll() {
		return studentRepository.findAll();
	}
}
