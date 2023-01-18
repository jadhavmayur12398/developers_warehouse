package com.jspiders.spring3.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.spring3.bean.StudentBean1;

public class StudentConfig1 {
	
	@Bean("student1")
	public StudentBean1 getStudent() {
		
		return new StudentBean1();
	}

}
