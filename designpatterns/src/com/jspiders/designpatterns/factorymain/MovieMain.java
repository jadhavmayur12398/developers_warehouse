package com.jspiders.designpatterns.factorymain;

import java.util.Scanner;

import com.jspiders.designpatterns.factoryinterface.Movie;
import com.jspiders.designpatterns.factorymovies.Kantara;
import com.jspiders.designpatterns.factorymovies.Kgf2;
import com.jspiders.designpatterns.factorymovies.Pushpa;
import com.jspiders.designpatterns.factorymovies.Vikram;

public class MovieMain {
	static boolean loop = true;
	static Movie movie;
	public static void main(String[] args) {
		while (loop) {
			try {
				movieFactory().nowPlaying();
			} catch (NullPointerException e) {
				System.out.println("NO movie selected");
			}
		}
	}
	public static Movie movieFactory() {
		System.out.println("Select a movie to watch:\n"
				+"1.K.G.F.chapter2\n"
				+ "2.Vikram\n"
				+ "3.Pushpa\n"
				+ "4.Kantara\n");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		
		switch (choice) {
		case 1: {
			movie = new Kgf2();
			loop = false;
			return movie;
		}
		case 2: {
			movie = new Vikram();
			loop = false;
			return movie;
		}
		case 3: {
			movie = new Pushpa();
			loop = false;
			return movie;
		}
		case 4: {
			movie = new Kantara();
			loop = false;
			return movie;
			
		}
		default:
			System.out.println("Invalid choice");
			loop = false;
			return movie;
		}
	}
	
}
