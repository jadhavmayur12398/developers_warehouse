package com.jspiders.mplayer.musicplayer;

import java.util.Scanner;

import com.jspiders.mpayer.songoperation.SongOperation;



public class MusicPlayer {
	static MusicPlayer musicPlayer=new MusicPlayer();
	static boolean loop=true;
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		while(loop) {
			try {
			musicPlayer.musicPlayer();
			}catch(NullPointerException e) {
				System.out.println("Not Selected");
				
			}
		}
		scanner.close();
		
	}
	
	public void musicPlayer()
	{
		
		SongOperation operations=new SongOperation();
		System.out.println("\nChoose one Option :\n"
				+ "1.Add/Remove Songs\n"
				+ "2.Play Songs\n"
				+ "3.Edit Songs\n"
				+ "4.Exit");
		
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("\nChoose one Option :\n"
					+ "1.Add Songs\n"
					+ "2.Remove Songs\n"
					+ "3.Back\n");
			int choice1=scanner.nextInt();
			switch(choice1)
			{
			case 1:
				operations.addSongs();
				
				break;
			case 2:
				operations.removeSongs();
				break;
			case 3:
				
				break;
			default :
				System.out.println("Invalid Input");
				System.out.println("Try Again");
				break;
				
			}
			break;
		case 2:
			System.out.println("\nChoose one Option :\n"
					+ "1.Play All Songs\n"
					+ "2.Play Random Song\n"
					+ "3.Select Song To Play\n"
					+ "4.Back\n");
			int choice2=scanner.nextInt();
			switch(choice2)
			{
			case 1:
			
				operations.playAllSongs();
				break;
			case 2:
				operations.playRandomSongs();
				break;
			case 3:
				operations.selectSongs();
				break;
			case 4:
				
				break;
			default :
				System.out.println("Invalid Input");
				System.out.println("Try Again");
				break;
				
			}
			break;
		case 3:
			operations.editSongs();
			break;
		case 4:
			System.out.println("Thank You...");
			loop=false;
			break;
		default :
			System.out.println("Invalid Input");
			System.out.println("Try Again");
			break;
		}
		
		
	}

}

