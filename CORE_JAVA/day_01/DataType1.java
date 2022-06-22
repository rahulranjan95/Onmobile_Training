package com.rahul.day_01;

public class DataType1 {
	
	static int x = 1;
	private  int y =3;
	public void method1(int x) {
		
		DataType1 t = new DataType1();
		
		this.x = 2;
		y = x;
		
		System.out.println("DataType1.x :" +DataType1.x);
		System.out.println("t.x:" + t.x);
		System.out.println("t.y:" + t.y);
		System.out.println("y:" + y);
	}
	
	public static void main(String[] args) {
		DataType1 t = new DataType1();
		
		t.method1(5);
		//y=7;
		//System.out.println("t.y:" + t.y);
		
	}

}
