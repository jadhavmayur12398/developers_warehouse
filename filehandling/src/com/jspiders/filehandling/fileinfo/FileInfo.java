package com.jspiders.filehandling.fileinfo;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File file = new File("DemoFile.txt");
		if (file.canRead()) {
			System.out.println("file is readable..!!");
		} else {
			System.out.println("file is not readable");
		}
		if (file.canWrite()) {
			System.out.println("file can writable..!!");
		} else {
			System.out.println("file can not writable");
		}
		if (file.canExecute()) {
			System.out.println("file is executable..!!");
		} else {
			System.out.println("file can not executable");
		}
		System.out.println(file.length());
	}
}
