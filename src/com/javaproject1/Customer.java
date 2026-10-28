package com.javaproject1;

public class Customer {
	int id;
	String cName;
	
	void hello(){
		Customer hello = new Customer();

		System.out.println("hello");
	}

	@Override
	protected void finalize() {
		System.out.println("finialise method called");
	}

	public static void main(String[] args) {

		Customer cust1 = new Customer();
		System.out.println(cust1);

		Customer cust2 = new Customer();
		System.out.println(cust2);

		Customer cust3 = new Customer();
		System.out.println(cust3);
		Customer cust4 = new Customer();
		System.out.println(cust4);

		cust2 = cust4;
		System.out.println(cust2);
		System.out.println(cust4);

		cust1 = null;
		cust2 = null;
		Customer h1 = new Customer();
		h1.hello();
	
		
		System.gc();

	}

}
