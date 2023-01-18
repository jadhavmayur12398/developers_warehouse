package com.jspiders.springmvc3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jspiders.springmvc3.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/home")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/add")
	public String add() {
		return "AddStudent";
	}
	
	@GetMapping("reemove")
	public String remove() {
		return "RemoveStudent";
	}
	
}
