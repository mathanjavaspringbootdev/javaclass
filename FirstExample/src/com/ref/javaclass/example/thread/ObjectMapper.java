package com.ref.javaclass.example.thread;

public class ObjectMapper<T> {
	
	T object;
	public ObjectMapper(T objParam) {
		this.object = objParam;
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("The Object is>>>" + object.toString());
	}

}
