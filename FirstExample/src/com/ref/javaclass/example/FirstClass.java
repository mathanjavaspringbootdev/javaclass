package com.ref.javaclass.example;
/**
 * 
 * @author Mathan
 * @version 1.0
 * 
 */
public class FirstClass {
// This line Won't compile
	/*
	 * THis also won't compile
	 * 
	 */
	public static String staticVariable = "Testing Variable";

	public String variable1 = "Testing Variable";
	public String variable2 = new String("String");
	final public int varInt = -10;
	public int varInt1 = 10;
	public long varLong = 1L;
	public float varFlt = 2.5f;
	public float varFlt2 = 5 / 2;
	public double vardbl = 8 /3;
	public char charecter = 'a';
	public char charecter1 = 47;
	
	public static void main(String[] args) {
		FirstClass clsObj = new FirstClass();
		System.out.println(clsObj.print("Hello ", "World!!!"));
		System.out.println(FirstClass.staticPrint());
		
		
		System.out.println("clsObj.varInt>>>>>" + clsObj.varInt);
		System.out.println("clsObj.varInt1>>>>>" +clsObj.varInt1);
		clsObj.varInt1  = 13;
		System.out.println("clsObj.varInt1>>>>>" +clsObj.varInt1);

	}
	
	public String print(String input, String input2) {
		return input + input2;
	}
	public static String staticPrint() {
		return "Return Static String";
	}
	
}
