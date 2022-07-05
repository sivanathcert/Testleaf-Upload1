package org.student;

// Importing Departmet package into Student 

import org.department.Department;

public class Student extends Department {

	// Creating Mesthods for Student data
	
	public void studentName() {
		System.out.println("-----------------------------------------------\n");
		System.out.println("\t Student Information\n");
		
		//Declaring Student name as String
		String studName = "Kanna Devan";
		System.out.println("Student Name : " + studName);
	}
	public void studentDept() {
		System.out.println("Student Dept : Computer");
	}
	public void studentId(int studID) {
		System.out.println("Student ID : " + studID);
		System.out.println("\t\n-----------------------------------------------\n\n");
	}

	public static void main(String[] args) {
		
		//Creating object		
		Student studData = new Student();
		
		//Calling College class methods
		studData.collgeName("Loyola College");
		studData.collgeCode();
		studData.collgeRank(1);
		
		//Calling Department class methods
		studData.deptName("Computer", "Biology", "Chemistry");
		
		//Calling Student class methods
		studData.studentName();
		studData.studentDept();
		studData.studentId(455564);
		
	}

}
