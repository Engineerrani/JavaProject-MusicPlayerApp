package com.rani;

public class Song {
	String title;
	double duration;
	
	public Song(String name, double duration) {
		this.title=name;
		this.duration=duration;
	}
	public Song() {
		
}
	public String getTilte() {
		return title;
	}
	public double getDuration() {
		return duration;
	}
	public String toString() {
		return "Song{"+"title'"+title+ '\'' +", duration="+duration+'}';
	}
}