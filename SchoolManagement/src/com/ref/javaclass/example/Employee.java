package com.ref.javaclass.example;

public class Employee extends Person {

	public Employee(String nameParam, Long phoneNumberParam, String emailIdParam) {
		super(nameParam, phoneNumberParam, emailIdParam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [" + (getName() != null ? "getName()=" + getName() + ", " : "")
				+ (getPhoneNumber() != null ? "getPhoneNumber()=" + getPhoneNumber() + ", " : "")
				+ (getEmailId() != null ? "getEmailId()=" + getEmailId() + ", " : "")
				+ (getAddr() != null ? "getAddr()=" + getAddr() : "") + "]";
	}
}
