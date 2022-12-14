package com.ref.javaclass.example.generic;

public class GenericExample {

	public static void main(String[] args) {
		ObjectMapper<Number> om = new ObjectMapper<>(10);
		om.print();
		 om = new ObjectMapper<>(10.6);
			om.print();
	}

}
