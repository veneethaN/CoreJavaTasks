package com.javaproject1;

public class Cricketer {
	
	//static variables
			static int countryID;
			static String countryName;
			
			// instance variable
			String cName;
			int jerseyNo;
			int highestScore;
			
	public static void main(String[] args) {
		System.out.println("Welcome To India Team");
		
		
		//Initialization
		
		countryID = 91;
		countryName = "India";
		Cricketer msd = new Cricketer();
		msd.cName = "Mahendra Singh Dhoni";
		msd.jerseyNo = 07;
		msd.highestScore = 90;

		//Accessing data
		
		System.out.println(countryID);
		System.out.println(countryName);
		System.out.println(msd.cName);
		System.out.println(msd.jerseyNo);
		System.out.println(msd.highestScore);
		
		Cricketer vk = new Cricketer();
		vk.cName = "virat";
		vk.jerseyNo = 18;
		vk.highestScore = 98;
		
		System.out.println("object1");
		System.out.println(countryID);
		System.out.println(countryName);
		System.out.println("cName: " + vk.cName);
		System.out.println("jerseyName: "+  vk.jerseyNo);
		System.out.println("highestScore: "+ vk.highestScore);


		Cricketer hitman = new Cricketer();
		hitman.cName = "hitman";
		hitman.jerseyNo = 52;
		hitman.highestScore = 98;
		
		System.out.println("object2");
		System.out.println(countryID);
		System.out.println(countryName);
		System.out.println("cName: " + hitman.cName);
		System.out.println("jerseyName: "+  hitman.jerseyNo);
		System.out.println("highestScore: "+ hitman.highestScore);





		
		
		

	}

}
