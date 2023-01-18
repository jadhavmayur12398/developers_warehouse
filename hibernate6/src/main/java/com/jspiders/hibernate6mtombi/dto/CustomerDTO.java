package com.jspiders.hibernate6mtombi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class CustomerDTO {
	@Id
	
	private int Id;
	private String Name;
	private long Contact;
	
	@ManyToMany(mappedBy = "customers")
	private List<ProductDTO> products;
}
