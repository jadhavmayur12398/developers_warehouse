package com.jspiders.springmvc3.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentPOJO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String Name;
	private String Email;
	private long Contact;
	private String UserName;
	private String Password;
}
