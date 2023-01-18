package com.jsp.springmvc1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springmvc1.repository.StudentRepository;
import com.jsp.springmvc1.pojo.StudentPOJO;

@Service
public class StudentService {
	@Autowired 
	private StudentRepository repository;
	
	public StudentPOJO login(String username, String password) {
		StudentPOJO pojo = repository.login(username, password);
		return pojo;
	}

	public StudentPOJO add(String name, String email, long contact, String username, String password) {
		StudentPOJO pojo = repository.add(name, email,
				contact, username, password);
		return pojo;
	}
	
	public StudentPOJO search(int id) {
		StudentPOJO pojo = repository.search(id);
		return pojo;
	}

	public List<StudentPOJO> searchAll() {
		List<StudentPOJO> pojos = repository.searchAll();
		return pojos;
	}

	public StudentPOJO remove(int id) {
		StudentPOJO pojo = repository.remove(id);
		return pojo;
	}

}
