package com.jspiders.hibernate3manytoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class EmployeeDTO {
@Id
	
	private int Id;
	private String Name;
	private double Salary;
	
	@ManyToOne
	private CompanyDTO company;
}
