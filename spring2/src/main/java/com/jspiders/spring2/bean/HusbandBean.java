package com.jspiders.spring2.bean;

import lombok.Data;

@Data
public class HusbandBean {
	
	private int Id;
	private String Name;
	private int Age;
	private WifeBean wife;

}
