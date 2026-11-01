package com.javaproject1;

 class Methods {
	static void method() {
		System.out.println("static method called");
		
	}
void method1() {
	System.out.println("Instance method called"); 
}
 static void method2() {
	 System.out.println("static method1 called");
	
}
 void method3() {
	

	 System.out.println("instance method2 called");
 }
 static {
		Methods M1 =new Methods();
		method();
		M1.method1();
		method2();
		M1.method3();
 }
   void Student(){
	   
	   Methods M1 =new Methods();
		method();
		M1.method1();
		method2();
		M1.method3();
 	 
 }
	public static void main(String[] args) {
		Methods m2= new Methods();
		m2.Student();
	System.out.println("completed");		
		

	}

}
