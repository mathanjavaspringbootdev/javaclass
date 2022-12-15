/**
 * 
 */
package com.ref.javaclass.example.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Admin
 *
 */
public class CalculatorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread.currentThread().setName("!Calculator Application Thread!");
		System.out.println("This Class Running in the Thread:" + Thread.currentThread().getName());
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");// dd/MM/yyyy
		Date now = new Date();
		System.out.println(sdfDate.format(now));
		String str1 = "Welcome";
		String str2 = "All";
		int s = 10;
		int d = 11;
		System.out.println(str1 + str2 + (s + d));
		// TODO Auto-generated method stub
		now = new Date();
		System.out.println(sdfDate.format(now));
		Calculator<Integer> calc = new Calculator<>("add", 1, 2);
		Thread t1 = new Thread(calc);
		t1.start();
		now = new Date();
		System.out.println(sdfDate.format(now));
		now = new Date();
		System.out.println(sdfDate.format(now));
		Calculator<Double> calc2 = new Calculator<>("add",1.0, 2.0);
		Thread t2 = new Thread(calc2);
		t2.start();
		now = new Date();
		System.out.println(sdfDate.format(now));
//		calc.subraction(2,1);
//		calc.multi(4,5);
//		calc.divide(5,2);
//		calc.reminder(5,2);
//		calc.add(1.5f, 2.5f);
	}

}
