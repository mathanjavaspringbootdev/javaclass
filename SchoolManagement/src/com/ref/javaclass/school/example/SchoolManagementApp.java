package com.ref.javaclass.school.example;

import java.util.Scanner;


public class SchoolManagementApp {

	public SchoolManagementApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		boolean canExit = false;
		Scanner scr = new Scanner(System.in);
		int opr;
		do {
			System.out.println("Enter the Option to perform the Operation\n1)Create Student\n2)Update Student \n3)Delete Student \n4)Display Stuudent Details \n5)Exit");
			opr = scr.nextInt();
			switch(opr) {
			case 1:
			{
				System.out.println("Adding student details");
			} break;
			case 2: {
				System.out.println("Updating student details");
			} break;
			case 3: {
				System.out.println("deleting student details");
			} break;
			case 4: {
				System.out.println("display student details");

			} break;
			case 5:
			{
				canExit = true;
			} break;
			default: {
				System.out.println("Error!!!. Please enter valid option");
			}
			}
		} while(!canExit);
		
		scr.close();
		
		Student stu1 = new Student("A1", 12331L, "a1@ref.com", 1);
		stu1.study();
		stu1.setName("A123");
		stu1.study();
		Employee emp = new Employee("E1", 111L, "wd@dwsd.csdfd");
		Address addr1 = new Address("Mount Road", "Chennai", "India");
		emp.setAddr(addr1);
		
		Employee emp2 = new Employee("E2", 112L, "e2@ref.com");
		Address addr2 = new Address("Mount Road", "Chennai", "India");
		emp2.setAddr(addr2);
		
		Standard firstStdEng = new Standard("1st", Medium.ENGLISH);
		Standard firstStdTamil = new Standard("1st", Medium.TAMIL);
		
		Section secA = new Section("A", firstStdEng);
		Section secB = new Section("B", firstStdEng);
		
		System.out.println(secA);
		System.out.println(secB);
		Section secX = new Section("X", firstStdTamil);
		Section secY = new Section("Y", firstStdTamil);
		
		
		stu1.setSection(secX);
		
		
		Subject tamil = new Subject("1st", Medium.TAMIL);
		Subject english = new Subject("1st", Medium.TAMIL);

		secX.getSubjects().add(tamil);
		secX.getSubjects().add(english);
		tamil.getSections().add(secX);
		english.getSections().add(secX);
		
		
		System.out.println(secX);
		System.out.println(secY);
		
		System.out.println(stu1);
		System.out.println("Employee Address Details>>>> " + emp.toString());
		
	}
}
