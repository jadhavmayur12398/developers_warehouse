package com.jsp.springmvc1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jsp.springmvc1.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/home")
	public String home() {
		return"Home";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "LoginForm";
	}
	
	
	
	@GetMapping("/add")
	public String add() {
		return "AddStudent";
	}
	
	@GetMapping("/remove")
	public String remove() {
		return "RemoveStudent";
	}
	
	@GetMapping("/search")
	public String search() {
		return "SearchStudent";
	}
	
	@GetMapping("/update")
	public String update() {
		return "UpdateStudent";
	}

}
