package com.uni.portal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uni.portal.entity.Student;
import com.uni.portal.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	StudentService service;

	@PostMapping("/add")
	public void addStudent(@RequestBody Student student) {
		logger.info("Adding student to db : ", student);
		service.save(student);
	}

	@GetMapping(value = "/get/{id}", produces = "application/json")
	public Student getStudent(@PathVariable int id) {
		logger.info("Getting student with id : ", id);
		return service.getById(id);
	}

	@GetMapping(value = "/load/{id}", produces = "application/json")
	public Student loadStudent(@PathVariable int id) {
		logger.info("Loading student with id : ", id);
		return service.getByLoadMethod(id);
	}

	@GetMapping("/getALLByQuery")
	public List<Student> getALLByQuery() {
		logger.info("Loading student from query");
		return service.getByQuery();
	}

	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
		logger.info("Getting all students");
		return service.getAll();
	}
}
