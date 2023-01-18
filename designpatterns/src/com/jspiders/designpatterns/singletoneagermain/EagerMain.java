package com.jspiders.designpatterns.singletoneagermain;

import com.jspiders.designpatterns.singletoneager.SingletonEager;

public class EagerMain {
	public static void main(String[] args) {
		SingletonEager.getObject();
		SingletonEager.getObject();
		SingletonEager.getObject();
		SingletonEager.getObject();
		SingletonEager.getObject();
	}
}
