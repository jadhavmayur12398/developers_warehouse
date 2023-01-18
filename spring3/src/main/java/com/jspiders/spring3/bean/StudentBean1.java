package com.jspiders.spring3.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class StudentBean1 {
	
	@Value("2")
	private int Id;
	
	@Value("raju")
	private String Name;
	
	@Value("paisadouble@scam.com")
	private String Email;
	
	@Value("9876543221")
	private long Contact;
	
	@Value("mumbai")
	private String City;

}
