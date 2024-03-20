package com.uni.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.uni.portal.entity.Subject;

@Repository
@EnableJpaRepositories
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
