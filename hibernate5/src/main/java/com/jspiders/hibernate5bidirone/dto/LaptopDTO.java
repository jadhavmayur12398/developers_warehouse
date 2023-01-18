package com.jspiders.hibernate5bidirone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class LaptopDTO {
	@Id
	
	private int Id;
	private String Company;
	private double Price;
	
	@OneToOne
	private IpAddDTO ipaddress;
}
