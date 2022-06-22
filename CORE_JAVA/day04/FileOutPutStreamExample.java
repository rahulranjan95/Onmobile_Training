package com.rahul.day04;
import java.io.FileOutputStream;

public class FileOutPutStreamExample {
	
	 public static void main(String[] args) {
	     
	     String data = "This is a line of text inside the file.";

	     try {
	         FileOutputStream output = new FileOutputStream("output.txt");

	         byte[] array = data.getBytes();

	         output.write(array);
	         
	         System.out.println(array);

	         output.close();
	     }

	     catch(Exception e) {
	         e.getStackTrace();
	     }
	 }
}	
