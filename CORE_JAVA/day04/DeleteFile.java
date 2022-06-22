package com.rahul.day04;

import java.io.File;

public class DeleteFile {
		public static void main(String[] args) {

		File file = new File("file.txt");

		boolean value = file.delete();
		if(value) {
			System.out.println("The File is deleted.");
		}
		else {
			System.out.println("The File is not deleted.");
		}
	}
}