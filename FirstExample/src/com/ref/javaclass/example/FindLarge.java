package com.ref.javaclass.example;

import java.util.Scanner;

public class FindLarge {

	public FindLarge() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number to elements?");
		int limit = scr.nextInt();
		int[] array = new int[limit];
		for(int index = 0; index < limit; index++) {
			System.out.println("Enter element " + (index + 1));
			array[index] = scr.nextInt();
		}
		int large = array[0];
		for(int index = 1; index < limit; index++) {
			if(large < array[index]) {
				large = array[index];
			}
		}
		System.out.println("Largest Element is>>>>" + large);
	}
		
}
