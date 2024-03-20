package com.uni.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.portal.entity.Subject;
import com.uni.portal.repo.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	SubjectRepository subjectRepository;

	public Subject save(Subject subject) {
		return subjectRepository.save(subject);
	}

}
