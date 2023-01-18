package com.jspiders.mpayer.songoperation;

import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;

import com.jspiders.mplayer.songs.Songs;

public class SongOperation {
	

	static Scanner scanner= new Scanner(System.in);
	static final List<Songs> arrayList=new ArrayList<Songs>();
	//static Iterator iterator=arrayList.iterator();
	//static SongOperations operations=new SongOperations();
	
	
	public void addSongs() {
		
		
		
		System.out.println("How Many songs to Add");
		
		int songAdd=scanner.nextInt();
		for(int i=0;i<songAdd;i++) {
			
		Songs songs=new Songs() ;
		
		System.out.println("Enter Id");
		int id=scanner.nextInt();
		songs.setId(id);
		System.out.println("Enter name");
		String name=scanner.next();
		songs.setName(name);
		System.out.println("Enter Movie/Album");
		String movie_album=scanner.next();
	    songs.setMovie_album(movie_album);
	    
		System.out.println("Enter Duration");
		int length=scanner.nextInt();
		songs.setLength(length);
		System.out.println("Enter singer");
		String singer=scanner.next();
		songs.setSinger(singer);
		System.out.println("Enter composer");
		String composer=scanner.next();
		songs.setComposer(composer);
		
		System.out.println("Enter lyricist");
		String lyricist=scanner.next();
		songs.setLyricist(lyricist);
		
		
		arrayList.add(songs);
		
		System.out.println("Add Successfully");

		}
		
		
		this.viewPlaylist();
	}
	
	public void viewPlaylist() {
		if(arrayList.isEmpty())
		{
			System.out.println("No Songs");
			System.out.println("1st Add Songs");
			addSongs();	
		}
		else {
			System.out.println("Song list::");
			int i=1;
			for(Songs songs:arrayList) {
				System.out.println(i+":"+songs.getName());
				i++;
			
			}
			
		}
		
		
	}
	
	public void playAllSongs() {
		if(arrayList.isEmpty())
		{
			System.out.println("No Songs");
			System.out.println("1st Add Songs");
			addSongs();	
		}
		else
		{
			System.out.println("Song list::");
			int i=1;
			for(Songs songs:arrayList) {
				System.out.println(i+":"+songs.getName());
				i++;
			
			}
			
			for(Songs songs:arrayList) {
				System.out.println("Playing:: "+songs.getName());
				try {
					Thread.sleep(songs.getLength()*1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Playlist end");
			
		}
		
		
	}
	public void selectSongs() {
		if(arrayList.isEmpty())
		{
			System.out.println("No Songs");
			System.out.println("1st Add Songs");
			addSongs();	
		}
		else
		{
			System.out.println("Song list::");
			int i=1;
			for(Songs songs:arrayList) {
				System.out.println(i+":"+songs.getName());
				i++;
			
			}
			
			int choice=scanner.nextInt();
			
			Songs songs = arrayList.get(choice-1);
			System.out.println(songs.getName()+" Now Playing");
			
			
			
		}
		
		
	}
	public void playRandomSongs() {
		if(arrayList.isEmpty())
		{
			System.out.println("No Songs");
			System.out.println("1st Add Songs");
			addSongs();	
		}
		else
		{
			System.out.println("Song list::");
			int i=1;
			for(Songs songs:arrayList) {
				System.out.println(i+":"+songs.getName());
				i++;
			
			}
			
			int choice=(int) (Math.random()*arrayList.size());
			
			Songs songs = arrayList.get(choice);
			System.out.println(songs.getName()+" Now Playing");
			
			
			
		}
		
		
	}
	public void removeSongs() {
		if(arrayList.isEmpty())
		{
			System.out.println("No Songs");
			System.out.println("1st Add Songs");
			addSongs();	
		}
		else
		{
			System.out.println("Song list::");
			int i=1;
			for(Songs songs:arrayList) {
				System.out.println(i+":"+songs.getName());
				i++;
			
			}
			int choice=scanner.nextInt();
			
			
			
			Songs songs=arrayList.remove(choice-1);
			
			
			System.out.println(songs.getName()+"Remove Successfully");
			
			
			this.viewPlaylist();
			
			
			
		}
		
		
	}
	public void editSongs() {
		if(arrayList.isEmpty())
		{
			System.out.println("No Songs");
			System.out.println("1st Add Songs");
			addSongs();	
		}
		else
		{
			System.out.println("Song list::");
			int i=1;
			for(Songs songs:arrayList) {
				System.out.println(i+":"+songs.getName());
				i++;
			
			}
			int choice=scanner.nextInt();
			
			
			Songs songs=arrayList.get(choice-1) ;
			
			System.out.println("Enter Id");
			int id=scanner.nextInt();
			songs.setId(id);
			System.out.println("Enter name");
			String name=scanner.next();
			songs.setName(name);
			System.out.println("Enter Movie/Album");
			String movie_album=scanner.next();
		    songs.setMovie_album(movie_album);
		    
			System.out.println("Enter Duration");
			int length=scanner.nextInt();
			songs.setLength(length);
			System.out.println("Enter singer");
			String singer=scanner.next();
			songs.setSinger(singer);
			System.out.println("Enter composer");
			String composer=scanner.next();
			songs.setComposer(composer);
			
			System.out.println("Enter lyricist");
			String lyricist=scanner.next();
			songs.setLyricist(lyricist);
			
			
			
			System.out.println(songs.getName()+" Edit Successfully");
			this.viewPlaylist();
			
			
		}
		
		
	}
	

}
