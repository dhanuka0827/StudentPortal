package com.uni.portal.controller;

import com.uni.portal.entity.Student;
import com.uni.portal.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/student")
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    StudentService service;

    @PostMapping("/add")
    public void addStudent(Student student){
        logger.info("Adding student to db : ", student);
        service.save(student);
    }

    @RequestMapping("/get/{id}")
    public Student getStudent(int id){
        logger.info("Getting student with id : ", id);
        return service.getById(id);
    }

    @RequestMapping("/getAll")
    public List<Student> getAllStudents(){
        logger.info("Getting all students");
        return service.getAll();
    }
}
