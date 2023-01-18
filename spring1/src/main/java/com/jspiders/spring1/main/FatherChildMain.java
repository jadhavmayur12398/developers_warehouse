package com.jspiders.spring1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring1.bean.FatherBean;

public class FatherChildMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("FatherChildConfig.xml");
		
		FatherBean bean = context.getBean(FatherBean.class);
		
		System.out.println(bean);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
