package com.javaproject1;

public class Bank {
	static String bankName;
	int accountNo;
	int totalBalance;
	String accountHolder;

	public static void main(String[] args) {
		bankName = "SBI";

		Bank p1 = new Bank();
		p1.accountNo = 123456789;
		p1.totalBalance = 30000;
		p1.accountHolder = "vineetha";

		System.out.println("main mathod started");
		p1.display();

	}

	void display() {
		System.out.println("bankName:" + bankName);
		System.out.println("accountNo:" + accountNo);
		System.out.println("totalBalance:" + totalBalance);
		System.out.println("accountHolder:" + accountHolder);

	}
}
