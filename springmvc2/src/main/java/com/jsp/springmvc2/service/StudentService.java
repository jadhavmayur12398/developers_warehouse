package com.jsp.springmvc2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springmvc2.pojo.StudentPOJO;
import com.jsp.springmvc2.repository.StudentRepository;
@Service
public class StudentService {
@Autowired
private StudentRepository repository;

public StudentPOJO login(String username, String password) {
	StudentPOJO pojo = repository.login(username, password);
	return pojo;
	
}

	public StudentPOJO add(String name, String email, long contact, String username, String password) {
		StudentPOJO pojo = repository.add(name, email, contact, username, password);
		return pojo;
	}

}
