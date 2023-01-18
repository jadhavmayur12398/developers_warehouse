package com.jspiders.hibernate4onetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class HusbandDTO {
@Id

	private int Id;
	private String Name;
	private String Email;
	private long Contact;
	
	@OneToOne
	private WifeDTO wife;
}
