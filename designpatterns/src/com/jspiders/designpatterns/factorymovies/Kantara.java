package com.jspiders.designpatterns.factorymovies;

import com.jspiders.designpatterns.factoryinterface.Movie;

public class Kantara implements Movie{
	public void nowPlaying() {
		System.out.println("Now playing Kantara");
	}
}