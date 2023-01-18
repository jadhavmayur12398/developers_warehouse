package com.jspiders.spring3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.spring3.bean.StudentBean;
import com.jspiders.spring3.config.StudentConfig;

public class StudentMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		
		StudentBean studentBean = context.getBean(StudentBean.class);
		
		System.out.println(studentBean);
		
		((AnnotationConfigApplicationContext)context).close();
	}

}
