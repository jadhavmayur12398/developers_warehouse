package com.jspiders.spring1.bean;

import java.util.List;

import lombok.Data;

@Data
public class FatherBean {
	
	private int Id;
	private String Name;
	
	private List<ChildBean> children;

}
