package com.jspiders.filehandling.deletefile;

import java.io.File;
import java.io.IOException;

public class FileDelete {
	public static void main(String[] args) {
		File file = new File("DeleteDemoFile.txt");
		try {
			file.createNewFile();
			System.out.println("file created..!!");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		file.delete();
		System.out.println("file deleted successfuly..!!");
	}
}
