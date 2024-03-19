package com.uni.portal.service;

import com.uni.portal.dao.StudentRepository;
import com.uni.portal.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }
    public Student getById(int id){
        return studentRepository.findById(id).orElse(null);
    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
}
