package com.jspiders.spring1.bean;

import lombok.Data;

@Data
public class HusbandBean {
	
	private int Id;
	private String Name;
	private WifeBean wife;

}
