package com.ref.javaclass.example.serialization;

// Java program to illustrate Serializable interface
import java.io.*;

// By implementing Serializable interface
// we make sure that state of instances of class A
// can be saved in a file.
class A implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 408582311807449904L;
	int i;
	String s;

	// A class constructor
	public A(int i, String s) {
		this.i = i;
		this.s = s;
	}
}

public class EXample {
	public static void main(String[] args)

	{
		A a = new A(20, "GeeksForGeeks");
		FileOutputStream fos;
		ObjectOutputStream oos = null;
		FileInputStream fis;
		ObjectInputStream ois = null;

		// Serializing 'a'
		try {
			fos = new FileOutputStream("xyz.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(a);

			// De-serializing 'a'
			fis = new FileInputStream("xyz.txt");
			ois = new ObjectInputStream(fis);
			A b = (A) ois.readObject(); // down-casting object
			System.out.println(b.i + " " + b.s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// closing streams
		}

	}
}
