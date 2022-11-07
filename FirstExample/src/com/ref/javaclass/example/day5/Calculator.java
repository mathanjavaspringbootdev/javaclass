package com.ref.javaclass.example.day5;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class Calculator {
	private String CONSTANT = "abcd";
	public void add() 
	{
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter first number to add: ");
		int i = scr.nextInt();
		System.out.println("Enter second number to add: ");
		int j = scr.nextInt();
		add(i,j);
		scr.close();
	}

	public void add(int i, int j) {
		int result = i + j;
		System.out.println(i + " + " + j + " = " + result);
	}
	
	public void add(float i, float j) {
		float result = i + j;
		System.out.println(i + " + " + j + " = " + result);

	}


	/**
	 * @param i
	 * @param j
	 */
	public void subraction(int i, int j) {
		int result = i - j;
		System.out.println(i + " - " + j + " = " + result);

	}

	public void multi(int i, int j) {
		int result = i * j;
		System.out.println(i + " * " + j + " = " + result);

	}

	/**
	 * 
	 * @param i
	 * @param j
	 */
	public void reminder(int i, int j) {
		int reminder = i % j;
		System.out.println(i + " % " + j + " = " + reminder);
	}

	public void divide(int i, int j) {
		float result = (float) i / j;
		System.out.println(i + " / " + j + " = " + result);
	}

}
