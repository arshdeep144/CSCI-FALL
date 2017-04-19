//Author: Arshdeep Benipal
//Student ID: 100591622
//Date: September 25 2016
//Purpose: Lab 2 Learning OOP 
import java.util.*;

public class Song{

	//create variables
	private String artist;
	private String title;
	private int duration;
	private static String collectionName;

	//create variables in song and print them
	public static void main(String[] args) {
		Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);
		Song one = new Song("Daft Punk", "One More Time", 322);
		sed.collectionName = "Randy's Collection";
		System.out.println("Collection: " + one.collectionName);
		printSong(sed);
		printSong(one);
	}

	//initialize variables
	public Song(String author, String songName, int length){
		this.artist = author;
		this.title = songName;
		this.duration = length;
	}

	// print function that prints the song title, artist, and duration
	public static void printSong(Song song) {
		int min = song.getDuration() / 60;
		int sec = song.getDuration() % 60;
		System.out.printf("%s (%s)  %d:%d\n",
						song.getTitle(),song.getArtist(),min,sec);
	}

	//set the artist variable
	public void setArtist(String author){
		this.artist = author;
	}

	//return the artist variable
	public String getArtist(){
		return this.artist;
	}

	//set the title variable
	public void setTitle(String songName){
		this.title = songName;
	}

	//return the title variable
	public String getTitle(){
		return this.title;
	}

	//set the duration variable
	public void setDuration(int length){
		this.duration = length;
	}

	//return the duration variable
	public int getDuration(){
		return this.duration;
	}
}