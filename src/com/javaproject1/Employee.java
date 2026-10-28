package com.javaproject1;
public class Employee {
	static String companyName;

	int empID;
	String eName;
	String eDepartment;

	public static void main(String[] args){
		System.out.println("Main Method Started");
		
		companyName="vcube";
		Employee emp1 = new Employee();	
		emp1.empID=01;
		emp1.eName="vineetha";
		emp1.eDepartment="Maths";
		System.out.println("object1*********");
		System.out.println(companyName);
		System.out.println("empID:"+emp1.empID);
		System.out.println("eName:"+emp1.eName);
		System.out.println("eDepartment:"+emp1.eDepartment);
		
		Employee emp2 = new Employee();	
		emp2.empID=02;
		emp2.eName="gowri";
		emp2.eDepartment="Science";
		System.out.println("object2*********");
		System.out.println("companyName:"+companyName);
		System.out.println("empID:"+emp2.empID);
		System.out.println("eName:"+emp2.eName);
		System.out.println("eDepartment:"+emp2.eDepartment);
		
		companyName="jsp";
		
		Employee emp3 = new Employee();	
		emp3.empID=03;
		emp3.eName="keerthi";
		emp3.eDepartment="Science";
		System.out.println("object3*********");
		System.out.println("companyName:"+companyName);
		System.out.println("empID:"+emp3.empID);
		System.out.println("eName:"+emp3.eName);
		System.out.println("eDepartment:"+emp3.eDepartment);
		
		
		

		

		
	}
		
		
		}
