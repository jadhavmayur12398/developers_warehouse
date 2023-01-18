package com.jspiders.spring1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring1.bean.CoustomerBean;
//import com.jspiders.spring1.bean.ProductBean;

public class CoustomerProductMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CoustomerProductConfig.xml");
		
		CoustomerBean coustomer1 = (CoustomerBean)context.getBean("coustomer1");
		CoustomerBean coustomer2 = (CoustomerBean)context.getBean("coustomer2");
		
		System.out.println(coustomer1);
		System.out.println(coustomer2);
		
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
