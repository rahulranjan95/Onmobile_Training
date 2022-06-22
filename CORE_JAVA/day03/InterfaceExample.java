package com.rahul.day03;

interface Artist {
	
	public void artistDetails();
}

interface Musician {
	
	public void details();
	
}

interface Person extends Artist, Musician {
	
	public void display();
	
}

 class Singer implements Person {
	
	public void display() {
		System.out.println("Person class implementation");
	}
	
	public void details() {
		System.out.println("Musicain class implementation");
		
	}
	
	public void artistDetails() {
		System.out.println("Artist class implementation");
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		
		Singer singer = new Singer();
		
		singer.display();
		singer.artistDetails();
		singer.details();

		System.out.println("Main class");
	}

}
