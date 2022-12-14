/**
 * 
 */
package com.ref.javaclass.example.generic;

/**
 * @author Admin
 *
 */
public class CalculatorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str1 = "Welcome";
		String str2 = "All";
		int s = 10;
		int d = 11;
		System.out.println(str1 + str2 + (s + d));

		// TODO Auto-generated method stub
		Calculator<Integer> calc = new Calculator<>();
		calc.add(1,2);
		Calculator<Double> calc2 = new Calculator<>();
		calc2.add(1.0,2.0);
//		calc.subraction(2,1);
//		calc.multi(4,5);
//		calc.divide(5,2);
//		calc.reminder(5,2);
//		calc.add(1.5f, 2.5f);
	}

}
