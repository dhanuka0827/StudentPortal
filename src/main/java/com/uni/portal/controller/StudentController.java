package com.uni.portal.controller;

import com.uni.portal.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/student")
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @RequestMapping("/add")
    public void addStudent(Student student){
        logger.info("Adding student to db : ", student);
    }


}
