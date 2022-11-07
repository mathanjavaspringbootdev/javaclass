/**
 * 
 */
package com.ref.javaclass.example;

/**
 * @author Admin
 *
 */
public class PackageExample {
	
	public static void main(String[] args) {
		Student mathan = new Student("Mathan", 1);
		Student Lavanya = new Student("Lavanya", 2);

		System.out.println("ToString MEthod calling>>>>>" + mathan.toString());
		System.out.println("ToString MEthod calling>>>>>" + Lavanya.toString());

		mathan.study("Maths");
		
	}

}
