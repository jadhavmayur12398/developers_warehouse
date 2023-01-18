package com.jspiders.multithreading.threads;

public class MyThread1 extends Thread {
		public void run() {
			for (int i=1; i<=5; i++) {
				System.out.println("MyThread1 is running now.... by using extends thread method...!!");
		}
	}
}
