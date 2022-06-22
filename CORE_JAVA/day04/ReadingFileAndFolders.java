package com.rahul.day04;
import java.io.File;
public class ReadingFileAndFolders {
		
		public static void main(String[] args) {

			File file = new File("C:\\Users\\Administrator\\rahul_training\\Onmobile_Training");
			String[] fileList = file.list();

			for(String str : fileList) {
				System.out.println(str);
			}
		}
}

























