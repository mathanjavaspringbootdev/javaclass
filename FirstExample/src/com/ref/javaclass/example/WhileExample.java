package com.ref.javaclass.example;

import java.io.InputStream;
import java.util.Scanner;

public class WhileExample {

	public WhileExample() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number to print?");
		int a = scr.nextInt();
		int count = 0 ;
		while(count <= a) {
			System.out.println("Count>>>>>" + count);
			count = count +1;
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<DO WHILE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		count = 0;
		do {

			System.out.println("Count>>>>>" + count);
			count = count +1;
		
		} while(count <= a);
		
	}

}
