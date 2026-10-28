package com.javaproject1;

class A {
	B b;
	@Override
	protected void finalize() {
		System.out.println("final method called");
}
}
class B {
	A a;
	@Override
	protected void finalize() {
		System.out.println("final method called");
}
}
public class TestIslandOfIsolation {
	
	public static void main(String[] args) {
		A b1=new A();
		B a1=new B();
		b1.b=a1;
		a1.a=b1;
		b1=null;
		a1=null;
		System.gc();
	
		
	}
}

