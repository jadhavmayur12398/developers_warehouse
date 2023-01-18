package com.jspiders.designpatterns.food;

import com.jspiders.designpatterns.foodinterface.FastFood;

public class Pasta implements FastFood{

	@Override
	public void orderFood() {
		System.out.println("Order Pasta");
	}

}
