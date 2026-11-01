package com.languagefundamentals;

public class Literals {

	public static void main(String[] args) {
		// float literals
		float f1 = 0123; 
		float f2 = 123.5f;
		float f3 = 0X123;
		float f4 = 0x123f;
		
	// double literals	
		double d1 = 0123;
		double d2 = 123.4d;
		double d3 = 0x123;
		double d4 = 0x123d;
		
		// char literals
		char c='A';
		int i = c;
		System.out.println(i);
		System.out.println((char)(i+1));
		char c2 = '\u0040';
		char c3 = '\u0340';
		
		// boolean literals
		boolean boo = true;
		if(boo) {
			System.out.println("hello");
		}
		// null  literals
		String s = null;
		s="king";   
		System.out.println(s);
		
		// string literals
		String s1 = "Ja" + "va";
		String s2 = "Java";
		String s3="Ja"+"va";
		System.out.println(s1==s2);
		System.out.println(s3==s1);
		String name=new String ("QUEEN");
		System.out.println(name);
		
		System.out.println("h: " + f1);
		System.out.println("O: "+f2);
		System.out.println("p: "+f3);
		System.out.println("w: "+f4);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(c);
		
		System.out.println(c2);
		System.out.println(c3);
		
		
	}

}
