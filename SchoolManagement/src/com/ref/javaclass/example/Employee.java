package com.ref.javaclass.example;

public class Employee extends Person {

	public Employee(String nameParam, Long phoneNumberParam, String emailIdParam) {
		super(nameParam, phoneNumberParam, emailIdParam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [getName()=" + getName() + ", getPhoneNumber()=" + getPhoneNumber() + ", getEmailId()="
				+ getEmailId() + ", getAddr()=" + getAddr() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
