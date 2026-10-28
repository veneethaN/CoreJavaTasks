package com.javaproject1;

public class Testdemo1 {
	static{
		System.out.println("static block called1");}
	
		{
		System.out.println("instance block called");
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println("main method ended");
	}
	Testdemo1 t1 =new Testdemo1();

	static {
		System.out.println("static block called2");

	}

}
