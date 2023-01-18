package com.jspiders.designpatterns.foodmain;

import java.util.Scanner;

import com.jspiders.designpatterns.food.Burger;
import com.jspiders.designpatterns.food.ColdCoffee;
import com.jspiders.designpatterns.food.Fries;
import com.jspiders.designpatterns.food.Pasta;
import com.jspiders.designpatterns.food.Pizza;
import com.jspiders.designpatterns.foodinterface.FastFood;

public class CafeMain {
	static boolean loop = true;
	static FastFood fastfood;
	
	public static void main(String[] args) {
		while (loop) {
			try {
				foodFactory().orderFood();
			} catch (NullPointerException e) {
				System.out.println("No food chosen");
			}
		}
	}
	public static FastFood foodFactory(){
		System.out.println("Order food:\n"
				+ "1.Pizza\n"
				+ "2.Burger\n"
				+ "3.Pasta\n"
				+ "4.Fries\n"
				+ "5.ColdCoffee\n");
		
		Scanner scanner = new Scanner(System.in);
		int order = scanner.nextInt();
		scanner.close();
		
		switch (order) {
		case 1:
			fastfood = new Pizza();
			loop = false;
			return fastfood;
		case 2:
			fastfood = new Burger();
			loop = false;
			return fastfood;
		case 3:
			fastfood = new Pasta();
			loop = false;
			return fastfood;
		case 4:
			fastfood = new Fries();
			loop = false;
			return fastfood;
		case 5:
			fastfood = new ColdCoffee();
			loop = false;
			return fastfood;
		default:
			System.out.println("Food you choose is not available");
		}
		return fastfood;
	}
}
