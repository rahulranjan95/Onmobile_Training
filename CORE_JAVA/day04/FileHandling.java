package com.rahul.day04;

import java.io.*;
public class FileHandling {
	
	public static void findFile() throws IOException {

	    File newFile = new File("rahul.txt");
	    FileInputStream stream = new FileInputStream(newFile);
	  }

	  public static void main(String[] args) {
	    try {
	      findFile();
	    }
	    catch (IOException e) {
	      System.out.println(e);
	    }
	  }

}
