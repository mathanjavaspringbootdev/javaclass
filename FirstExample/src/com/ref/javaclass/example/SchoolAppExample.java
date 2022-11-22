package com.ref.javaclass.example;

import java.util.Scanner;

public class SchoolAppExample {

	public SchoolAppExample() {
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
	}

}
