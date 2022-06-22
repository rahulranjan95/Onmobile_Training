package com.rahul.day03;

interface Artist1 {
	
	public void artistDetails();
}

interface Musician1 {
	
	public void details();
	
}

class Person1 implements Artist1, Musician1 {
	
	public void details() {
		System.out.println("Artist class");
	}
	public void artistDetails() {
		System.out.println("Musical class");
	}
	
}

//Third assignment implementation
abstract class Animal {
	
	Animal(){		
	}
	public void eat() {
		System.out.println("I am eating");
	}
	
	public abstract void makeSound();
	
}
class Dog extends Animal {
	
	Dog(){
		super();
	}
	
	public void makeSound() {
		System.out.println("Woo Woo");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
	Dog d1 = new Dog();
	
	d1.eat();
	d1.makeSound();

	}

}
