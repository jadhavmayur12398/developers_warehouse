package com.jspiders.spring2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring2.bean.StudentBean;

public class StudentMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		StudentBean studentBean = (StudentBean)context.getBean("student1");
		
		System.out.println(studentBean);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
