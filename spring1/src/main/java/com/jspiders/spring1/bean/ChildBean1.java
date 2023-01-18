package com.jspiders.spring1.bean;

import lombok.Data;

@Data
public class ChildBean1 {
	
	private int Id;
	private String Name;
	private FatherBean1 father;

}
