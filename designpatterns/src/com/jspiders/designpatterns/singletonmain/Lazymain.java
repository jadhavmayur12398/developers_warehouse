package com.jspiders.designpatterns.singletonmain;

import com.jspiders.designpatterns.singletonobject.SingletonLazy;

public class Lazymain {
	public static void main(String[] args) {
		SingletonLazy.getObject();
		SingletonLazy.getObject();
		SingletonLazy.getObject();
		SingletonLazy.getObject();
		SingletonLazy.getObject();
	}
}
