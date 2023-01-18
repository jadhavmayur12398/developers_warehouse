package com.jspiders.hibernate3manytoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CompanyDTO {
	@Id
	
	private int RegNo;
	private String Name;
	private String Location;
}
