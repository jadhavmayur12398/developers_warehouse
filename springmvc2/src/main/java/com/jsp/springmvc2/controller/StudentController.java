package com.jsp.springmvc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.springmvc2.pojo.StudentPOJO;
import com.jsp.springmvc2.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/home")
	public String home() {
		return "Home";
	}
	
	@PostMapping("/login")
	public String login() {
		return "LoginForm";
	}
	
	@GetMapping("/add")
	public String add() {
		return "AddStudent";
	}
	
	@PostMapping("/add")
	public String addData(@RequestParam String name,
			@RequestParam String email,
			@RequestParam long contact,
			@RequestParam String username,
			@RequestParam String password,
			ModelMap map) {
		StudentPOJO student = service.add(name, email,
				contact, username, password);
		if (student != null) {
			map.addAttribute("student", student);
		} else {
			map.addAttribute("msg", "Data not added.!");
		}
		return "AddStudent";
	}
	
	@GetMapping("/search")
	public String search() {
		return "SearchStudent";
	}
	
	@GetMapping("/update")
	public String update() {
		return "UpdateStudent";
	}
	
	@GetMapping("/remove")
	public String remove() {
		return "RemoveStudent";
	}

	@GetMapping("/logout")
	public String logout() {
		return "LoginForm";
	}
}