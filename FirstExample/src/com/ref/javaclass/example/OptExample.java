package com.ref.javaclass.example;

import java.io.InputStream;
import java.util.Scanner;

public class OptExample {

	public OptExample() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {	
	
		// & |   
		//&& ||
	   String str = null;
		
		if(str != null && str.equals("abcd")) {
			System.out.println("false");
		} else {
			System.out.println("str is null or not equal to abcd");
		}
		
		if(false && true) {
			System.out.println("false");
		} else {
			System.out.println(true);
		}
		
}

}
