package com.ref.javaclass.example;

import java.io.InputStream;
import java.util.Scanner;

public class RightHandInvTriangleExample {

	public RightHandInvTriangleExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number to print?");
		int limit = scr.nextInt();
		/*
		 * *****           - space - 0, star - 5, line - 1, limit - 5
		 *  ****           - space - 1, star - 4, line - 2,
		 *   ***           - space - 2, star - 3, line - 3,
		 *    **           - space - 3, star - 2, line - 4,
		 *     *           - space - 4, star - 1, line - 5,
		 * star = limit - line_no + 1
		 * 
		 */
		for(int line_no = 1 ; line_no <= limit;line_no++) {
			for(int col_no = limit ; col_no > 0;col_no--) {
				if(col_no <= limit - line_no + 1) {					
					System.out.print("* "); 
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
