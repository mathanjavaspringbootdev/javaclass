package com.ref.javaclass.school.example;
/**
 * 
 */

/**
 * @author Admin
 *
 */
public class Person {
	private String name;
	private Long phoneNumber;
	private String emailId;
	private Address addr;
	
	public Person(String nameParam, Long phoneNumberParam, String emailIdParam) {
		this.name = nameParam;
		this.phoneNumber = phoneNumberParam;
		this.emailId = emailIdParam;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public void walk() {
		System.out.println(name + " is walking!!!");
	}
	
	public void talk()  {
		System.out.println(name + " is talking!!!");
	}
	

}
 