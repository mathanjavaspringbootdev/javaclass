package com.ref.javaclass.example;


public class Student extends Person {
	Integer studentNumber;
	
	private Section section;
	
	public Student(String nameParam, Long phoneNumberParam, String emailIdParam,Integer stdNumParam) {
		super(nameParam, phoneNumberParam, emailIdParam);
		this.studentNumber = stdNumParam;
	}

	/**
	 * @return the section
	 */
	public Section getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(Section section) {
		this.section = section;
		this.section.getStudents().add(this);
	}

	public void study() {
		System.out.println(this.getName() + " is Studying " );
	}

	@Override
	public String toString() {
		return "Student [" + (studentNumber != null ? "studentNumber=" + studentNumber + ", " : "")
				+ (section != null ? "section=" + section.getName() : "") + "]";
	}

}
