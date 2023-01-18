package com.jspiders.multithreading.threads;

public class MyThread2 implements Runnable {
		public void run() {
			for (int i=0; i<=5; i++) {
				System.out.println("MyThread2 is running Now.... By ussing implements Runnable ...!!");
		}
	}
}
