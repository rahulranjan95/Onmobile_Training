package com.rahul.day_01;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter float Value:");
		float fValue = scanner.nextFloat();
		System.out.println("Value:" + fValue);
		
		System.out.println("Enter double Value:");
		double dValue = scanner.nextDouble();
		System.out.println("Value:" + dValue);
		
		System.out.println("Enter String:");
		String name = scanner.next();
		System.out.println("Value:" + name);
		
		
	}

}
