package com.ref.javaclass.example;

import java.io.InputStream;
import java.util.Scanner;

public class PramidExample {

	public PramidExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number to print?");
		int limit = scr.nextInt();
		/*
		 *     *           - space - 4, star - 1, line - 1, limit - 5
		 *    **           - space - 3, star - 2, line - 2,
		 *   ***           - space - 2, star - 3, line - 3,
		 *  ****           - space - 1, star - 4, line - 4,
		 * *****           - space - 0, star - 5, line - 5,
		 * space = limit - line_no
		 */
		for(int line_no = 1 ; line_no <= limit;line_no++) {
			for(int col_no = 1 ; col_no <= limit;col_no++) {
				if(col_no <= limit - line_no) {
					System.out.print("  ");
				} else {					
					System.out.print("* ");
				}
					
			}
			for(int star= 1; star< line_no; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
