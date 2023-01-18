package com.jspiders.spring2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring2.bean.HusbandBean;

public class HusbandWifeMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("HusbandWifeConfig.xml");
		
		HusbandBean husbandBean = (HusbandBean)context.getBean("husband1");
		
		System.out.println(husbandBean);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
