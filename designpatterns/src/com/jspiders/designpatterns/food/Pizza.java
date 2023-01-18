package com.jspiders.designpatterns.food;

import com.jspiders.designpatterns.foodinterface.FastFood;

public class Pizza implements FastFood{

	@Override
	public void orderFood() {
		System.out.println("Order Pizza");
		
	}

}
