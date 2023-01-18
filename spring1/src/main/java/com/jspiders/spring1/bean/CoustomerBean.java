package com.jspiders.spring1.bean;

import java.util.List;

import lombok.Data;

@Data
public class CoustomerBean {
	
	private int Id;
	private String Name;
	private List<ProductBean> products;

}
