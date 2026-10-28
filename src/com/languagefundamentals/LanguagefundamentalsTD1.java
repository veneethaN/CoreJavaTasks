package com.languagefundamentals;

public class LanguagefundamentalsTD1 {
	byte b=127;
	byte b1 = (byte)126;	
	short s;
	int i;
	long l;
	
	float f;
	double d;
	char c;
	boolean boo;

	public static void main(String[] args) {
		LanguagefundamentalsTD1 t1=new LanguagefundamentalsTD1();
		System.out.println("byte value :"+t1.b);
		System.out.println("short values :"+t1.s);
		System.out.println("int values :"+t1.i);
		System.out.println("long values :"+t1.l);
		
		System.out.println("float values :"+t1.f);
		System.out.println("double values :"+t1.d);
		System.out.println("char values :"+t1.c);
		System.out.println("boolean values :"+t1.boo);

	}

}
