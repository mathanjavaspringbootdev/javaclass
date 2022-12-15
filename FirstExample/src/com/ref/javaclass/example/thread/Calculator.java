package com.ref.javaclass.example.thread;

/**
 * @author Admin
 *
 */
public class Calculator<T extends Number> implements Runnable {

	String operation;
	T a;
	T b;

	public Calculator(String operation, T a, T b) {
		this.operation = operation;
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		switch (operation) {
		case "add":
			this.add(a, b);
			break;
		default:
			System.out.println("wrong Input");
		}
	}

	public void add(T a, T b) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (a instanceof Double || b instanceof Double) {
			System.out.println();
			System.out.println(a.doubleValue() + b.doubleValue());
		} else if (a instanceof Float || b instanceof Float) {
			System.out.println(a.floatValue() + b.floatValue());
		} else if (a instanceof Long || b instanceof Long) {
			System.out.println(a.longValue() + b.longValue());
		} else {
			System.out.println(a.intValue() + b.intValue());
		}
	}

	/**
	 * @param i
	 * @param j
	 */
	public void subraction(int i, int j) {
		int result = i - j;
		System.out.println(i + " - " + j + " = " + result);

	}

	public void multi(int i, int j) {
		int result = i * j;
		System.out.println(i + " * " + j + " = " + result);

	}

	/**
	 * 
	 * @param i
	 * @param j
	 */
	public void reminder(int i, int j) {
		try {
			int reminder = i % j;
			System.out.println(i + " % " + j + " = " + reminder);
		} catch (Exception e) {
			System.err.println("Issue with reminder >>>>");
			e.printStackTrace();
			System.err.println(e.getMessage());

		} finally {
			System.out.println("Finish of reminder method!");
		}

	}

	public void divide(int i, int j) {
		try {
			float result = (float) i / j;
			System.out.println(i + " / " + j + " = " + result);
		} catch (Exception e) {
			System.err.println("Issue with divide >>>>");
			e.printStackTrace();
			System.err.println(e.getMessage());
		} finally {
			System.out.println("Finish of divide method!");
		}
	}

}
