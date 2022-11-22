package com.ref.javaclass.example;

import java.io.InputStream;
import java.util.Scanner;

public class IfElseExample {

	public IfElseExample() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		int a = 10;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number to check odd or even?");
		a = scr.nextInt();
		if(a%2 != 0) {
			 System.out.println(a + " is a odd number");
		} else {
			System.out.println(a + " is a even number");
		}
		System.out.println("Enter the berth number to check berth?");
		int berthNo = scr.nextInt();
		int mod = berthNo % 8;
		if(mod == 1) {
			System.out.println(berthNo + " is a lower");
		} else if (mod == 2) {
			System.out.println(berthNo + " is a middle");
		}else if(mod == 3) {
			System.out.println(berthNo + " is a upper");
		} else if (mod == 4) {
			System.out.println(berthNo + " is a lower");
		}else if(mod == 5) {
			System.out.println(berthNo + " is a middle");
		} else if (mod == 6) {
			System.out.println(berthNo + " is a Upper");
		}else if(mod == 7) {
			System.out.println(berthNo + " is a side lower");
		} else if (mod == 0) {
			System.out.println(berthNo + " is a side Upper");
		} else {
		 System.out.println("Invalid input");
		}

		
	}

}
