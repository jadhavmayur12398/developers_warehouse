package com.jspiders.spring3.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.spring3.bean.StudentBean;

public class StudentConfig {
	
	@Bean
	public StudentBean getStudent() {
		StudentBean student = new StudentBean();
		student.setId(1);
		student.setName("shyam");
		student.setEmail("shyam@anuradha");
		student.setContact(9876543210L);
		student.setCity("mumbai");
		return student;
	}

}
