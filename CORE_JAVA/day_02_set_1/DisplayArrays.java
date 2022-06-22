package com.rahul.day_02_set_1;
import java.util.Arrays;
public class DisplayArrays {
	
	public static void main(String[] args) {
		int arr[] = {343,2,23442,34,234};
		
		int arr1[] = {3,4,56,4};
		
		int arr2[] = new int[arr.length+arr.length];
		
		System.arraycopy(arr,0,arr2,0,arr.length);
		System.arraycopy(arr, 0, arr2, arr.length,arr1.length);
		
		System.out.println("Result after copy" +Arrays.toString(arr2));
	}
	

}
