package com.ref.javaclass.example;

public class SchoolManagementApp {

	public SchoolManagementApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Student stu1 = new Student("A1", 12331L, "a1@ref.com", 1);
		stu1.study();
		stu1.setName("A123");
		stu1.study();
		
		Employee emp = new Employee("E1", 111L, "wd@dwsd.csdfd");
		Address addr1 = new Address("Mount Road", "Chennai", "India");
		emp.setAddr(addr1);
		
		System.out.println("Employee Address Details>>>> " + emp.getAddr());
		
		
		
	}
}
