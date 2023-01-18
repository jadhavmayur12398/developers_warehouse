package com.jspiders.designpatterns.singletoneager;

public class SingletonEager {
	static int objectCount;
	static SingletonEager singletoneager = new SingletonEager();
	private SingletonEager() {
		objectCount ++;
	}
	public static SingletonEager getObject() {
		System.out.println("object created" + objectCount + "times");
		return singletoneager;
	}
}
