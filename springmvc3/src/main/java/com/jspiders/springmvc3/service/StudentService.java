package com.jspiders.springmvc3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springmvc3.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	
	
}
