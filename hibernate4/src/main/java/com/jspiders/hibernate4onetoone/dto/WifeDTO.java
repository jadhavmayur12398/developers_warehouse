package com.jspiders.hibernate4onetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class WifeDTO {
	@Id
	
	private int Id;
	private String Name;
	private String Email;
	private long Contact;
}
