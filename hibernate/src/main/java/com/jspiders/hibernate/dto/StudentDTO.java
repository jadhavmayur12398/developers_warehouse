package com.jspiders.hibernate.dto;

import javax.persistence.Entity; 
import javax.persistence.Id;

import lombok.Data;



@Entity
@Data

public class StudentDTO {
	
	@Id

	private int Id;
	private String Name;
	private String Email;
//	private long Contact;
	private String City;
	private String Address;

}
