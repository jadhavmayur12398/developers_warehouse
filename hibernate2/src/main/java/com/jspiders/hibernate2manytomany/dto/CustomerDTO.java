package com.jspiders.hibernate2manytomany.dto;

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
	private String Email;
	private long Contact;
	
	@ManyToMany
	
	private List<ProductDTO> products;
}
