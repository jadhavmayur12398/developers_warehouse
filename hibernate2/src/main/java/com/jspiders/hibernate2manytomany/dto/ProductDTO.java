package com.jspiders.hibernate2manytomany.dto;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductDTO {
	@Id
	
	private int Id;
	private String Name;
	private double Price;
	private String Catagory;
}
