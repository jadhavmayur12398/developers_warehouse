package com.jspiders.spring1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring1.bean.ChildBean1;

public class FatherChildMain1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("FatherChildConfig1.xml");
		
		ChildBean1 child1 = (ChildBean1)context.getBean("child1");
		ChildBean1 child2 = (ChildBean1)context.getBean("child2");
		
		System.out.println(child1);
		System.out.println(child2);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
