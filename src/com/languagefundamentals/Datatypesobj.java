package com.languagefundamentals;

public class Datatypesobj {


	public static void main(String[] args) {
		Integer sal = 5000;
		Double gst= sal * 0.3;
		Double pf= sal*0.2;
		Double allowence= sal*0.2;
		Double afterdeduction = sal-gst-pf;
		Double monthlysal = afterdeduction+allowence;
		
		System.out.println(afterdeduction);

		System.out.println(monthlysal);
		System.out.println(monthlysal*12);
		
		
		
		

		
		// TODO Auto-generated method stub

	}

}
