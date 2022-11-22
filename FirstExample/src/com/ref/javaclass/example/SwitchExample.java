package com.ref.javaclass.example;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample {

	public SwitchExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the berth number to check berth?");
		int berthNo = scr.nextInt();
		int mod = berthNo % 8;
		switch (mod) {
		case 1:
		case 4: {
			System.out.println(berthNo + " is a lower");
		} break;
		case 2:
		case 5: {
			System.out.println(berthNo + " is a middle");
		}
			break;
		case 3:
		case 6: {
			System.out.println(berthNo + " is a upper");
		}
			break;
		case 7: {
			System.out.println(berthNo + " is a side lower");
		}
			break;
		case 0: {
			System.out.println(berthNo + " is a side Upper");
		}
			break;
		default: {
			System.out.println("Invalid input");
		}
		}
	}

}
