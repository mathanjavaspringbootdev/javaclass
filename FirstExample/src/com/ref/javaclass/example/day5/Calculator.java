package com.ref.javaclass.example.day5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class Calculator {
	public void add() {

		Scanner scr = null;
		int i = 0, j = 0;
		boolean isValidInput = false;
		scr = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter first number to add: ");
				i = scr.nextInt();
				checkValueRange(i);
				System.out.println("Enter second number to add: ");
				j = scr.nextInt();
				checkValueRange(j);
				isValidInput = true;
			} catch (InputMismatchException e) {
				String input = scr.next();
				System.out.println("Issue in getting input!!!!: Reason: " + input + " is a wrong format");
			} catch (RefException e) {
				System.out.println("Issue in getting input!!!!: Reason: " +  e.getMessage());
			}
		} while (!isValidInput);
		
		scr.close();
		add(i, j);
		subraction(i, j);
		multi(i, j);
		divide(i, j);
		reminder(i, j);

	}

	private void checkValueRange(int i) throws RefException {
		if (i > 100) {
			 throw new RefException("Input range must be below 100");
		}
		
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
		try {
			int reminder = i % j;
			System.out.println(i + " % " + j + " = " + reminder);
		} catch (Exception e) {
			System.err.println("Issue with reminder >>>>");
			e.printStackTrace();
			System.err.println(e.getMessage());

		} finally {
			System.out.println("Finish of reminder method!");
		}

	}

	public void divide(int i, int j) {
		try {
			float result = (float) i / j;
			System.out.println(i + " / " + j + " = " + result);
		} catch (Exception e) {
			System.err.println("Issue with divide >>>>");
			e.printStackTrace();
			System.err.println(e.getMessage());
		} finally {
			System.out.println("Finish of divide method!");
		}
	}

}
