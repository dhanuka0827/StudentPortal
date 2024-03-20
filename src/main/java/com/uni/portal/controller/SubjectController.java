package com.uni.portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uni.portal.entity.Subject;
import com.uni.portal.service.SubjectService;

@RestController
@RequestMapping("subject")
public class SubjectController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    SubjectService service;

    @PostMapping("/add")
    public void addSubject(@RequestBody Subject subject){
        logger.info("Adding student to db : ", subject);
        service.save(subject);
    }

}
