package com.jspiders.designpatterns.singletonobject;

public class SingletonLazy {
	static SingletonLazy singletonlazy;
	int objectCount;
	
	private SingletonLazy() {
		objectCount ++;
		System.out.println("object created" +objectCount+ "times");
	}
	
	public static SingletonLazy getObject() {
		if (singletonlazy == null) {
			singletonlazy = new SingletonLazy();
			return singletonlazy;
		}
		return singletonlazy;
	}
}
