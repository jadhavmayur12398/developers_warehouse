package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("F:DemomFile1.txt");
		try {
			file.createNewFile();
			System.out.println("new file1 is created successfuly..!!");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
