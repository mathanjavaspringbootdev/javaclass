package com.ref.javaclass.example;

import java.io.InputStream;
import java.util.Scanner;

public class HalfNumExample {

	public HalfNumExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number to print?");
		int limit = scr.nextInt();
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * 
		 */
		for(int line_no = 1 ; line_no <= limit;line_no++) {
			for(int col_no = 1 ; col_no <= line_no;col_no++) {
				System.out.print(col_no + " ");
			}
			System.out.println();
		}
	}

}
