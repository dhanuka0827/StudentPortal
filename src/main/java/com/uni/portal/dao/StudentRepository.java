package com.uni.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uni.portal.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


}
