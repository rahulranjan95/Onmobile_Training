package com.rahul.day_02_set_1;

public class SumAndAvg {

	public static void main(String[] args) {
		int[] numbers = {3,5,-4,-7,5,7,8};
		
		int sum = 0;
		Double average;
		
		for(int el : numbers) {
			sum += el;
		}
		
		average = (double)sum/(double)numbers.length;
		System.out.println("Sum is: " + sum);
		System.out.println("Average of array element is: " + average);
	}
}
