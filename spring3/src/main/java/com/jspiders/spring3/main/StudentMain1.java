package com.jspiders.spring3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.spring3.bean.StudentBean1;
import com.jspiders.spring3.config.StudentConfig1;

public class StudentMain1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig1.class);
		
		StudentBean1 studentBean1 = (StudentBean1)context.getBean("student1");
		
		System.out.println(studentBean1);
		
		((AnnotationConfigApplicationContext)context).close();
	}

}
