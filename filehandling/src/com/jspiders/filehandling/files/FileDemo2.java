package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("D:\\DemoFil.txt");
		try {
			if (file.exists()) {
				System.out.println("file already exist...");
			} else {
				file.createNewFile();
				System.out.println("File created successfuly...!!");
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
