package com.jspiders.hibernate5bidirone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class IpAddDTO {
	@Id
	
	private int Id;
	
	@OneToOne
	private LaptopDTO laptop;
}
