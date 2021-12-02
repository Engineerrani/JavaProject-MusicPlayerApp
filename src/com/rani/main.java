package com.rani;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
	private static ArrayList<Album>albums =new ArrayList<>();
	
	public static void main(String[] args, String title) {
		
		
		Album album=new Album(name: "Album1",artist:"AC/DC");
		
		album.addSong(title:"TNT",duration:4.5);
		album.addSong(title:"Highway to hell",duration:3.5);
		album.addSong(title:"ThunderStruck",duration:5.0);
		albums.add(album);
		
		album=new Album(name:"album2",artist:"Eminem");
		
		album.addSong(title:"Rap god",duration:4.5);
		album.addSong(title:"Not Afraid",duration:3.5);
		album.addSong(title:"Lose yourself",duration:4.5);
		
			albums.add(album);
			
			LinkedList<Song> playList_1 = new LinkedList<>;
			
			albums.get(0).addToPlayList(title:"TNT",playList_1);
			albums.get(0).addToPlayList(title:"Highway to hell",playList_1);
			albums.get(1).addToPlayList(title:"Rap god",playList_1);
			albums.get(1).addToPlayList(title:"Lose ourself",playList_1);
			
			play(playList_1);
		} 
	
	private static void play(LinkdList<Song>.playList) {
		Scanner sc=new Scanner(System.in);
		boolean quit=false;
		boolean forward=true;
		ListIterator<Song> listIterator=playList.listIterator();
		
		if(playList.size()==0) {
			System.out.println("This playlist have no song");
		}else {
			System.out.println("Now playList"+ listIterator.next.toString());
		printMenu();
		}
		while(!quite) {
			int action=sc.nextInt();
			sc.nextLine();
			
			switch(action) {
			
			case 0:
				System.out.println("playList complete");
				Quite=true;
				break;
				
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward=true;
				}
				if(listIterator.hasNext()) {
					Systm.out.println("Now playing"+listIterator.next().toString());
				}else {
					Systm.out.println("no song available,reached to the end of th list");
					forward=false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward=false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing" +listIterator.previous().toString());
					
				}else {
					System.out.println("we are the first song");
					forward=false;
				}
				break;
				
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing" +listIterator.previousIndex().toString());
						forward=false;
					}else {
						System.out.println("we are at the start of the list");
					}
				}else {
					if(listIyerator.hasNext()) {
						System.out.println("now playing" +listIterator.next().toString());
						forward=true;
					}else {
						System.out.println("we have reached to the end of list");
					}
				}
				break;
				
			case 4:
				printList(playlist);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(palyList.size()>0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("now playing" +listIterator.next().toString());
						forward=true;
					}
					else {
						if(listIterator.hasPrevious())
							System.out.printl("now playing" +listIterator.previous().toString());
					}
				}
			}
		}
	}
	private static void printMenu() {
		System.out.println("Available options\n press");
		System.out.println("0-to quite\n"+"1-to play next song\n"+"2-to play previous song\n"+"3-to replay the current song\n"+
		"4_list of all songs \n"+"5-print all available options\n"+"6-delete current song");
		
	}
	private static void printList(LinkedList<Song> playList){
		Iterator<Song> iterator =playList.iterator();
		System.out.println(iterator.next());
}
	System.out.println("-------------");
}
