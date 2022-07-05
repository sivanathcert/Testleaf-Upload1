package org.department;

//Importing College package into Student

import org.college.College;

public class Department extends College {
	
	// Creating Mesthods for College data
	
	public void deptName(String dept1, String dept2, String dept3) {
		System.out.println("-----------------------------------------------\n");
		System.out.println("\t Departments Name\n");
		System.out.println("Department Name : " + dept1);
		System.out.println("Department Name : " + dept2);
		System.out.println("Department Name : " + dept3);
		
		String dept4 = "Psychology";
		System.out.println("Department Name : " + dept4);
		System.out.println("\n-----------------------------------------------\n\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
