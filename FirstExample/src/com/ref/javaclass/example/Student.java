/**
 * 
 */
package com.ref.javaclass.example;

/**
 * @author Admin
 *
 */
public class Student {
	private String name;
	private int rollNumber;

	public Student() {
		System.out.println("Constructor called!!!!!");
	}

	public Student(String nameParam, int rollNumberParam) {
		this.name = nameParam;
		this.rollNumber = rollNumberParam;
	}

	public void study(String bookname)
	{
		System.out.println(this.name + " is studying >>>" + bookname);
	}
	@Override
	public String toString() {
		return "Name: " + this.name + " , RollNumber:" + this.rollNumber;
	}

}
