package com.ref.javaclass.school.example;

import java.util.ArrayList;
import java.util.List;


public class Section {

	@Override
	public String toString() {
		return "Section [" + (name != null ? "name=" + name + ", " : "") + (std != null ? "std=" + std + ", " : "")
				+ (students != null ? "students=" + students + ", " : "")
				+ (subjects != null ? "subjects=" + subjects : "") + "]";
	}

	private String name;

	private Standard std;

	private List<Student> students = new ArrayList<>();
	
	private List<Subject> subjects = new ArrayList<>();

	public Section(String nameParam, Standard stdParam) {
		this.name = nameParam;
		this.std = stdParam;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the std
	 */
	public Standard getStd() {
		return std;
	}

	/**
	 * @param std the std to set
	 */
	public void setStd(Standard std) {
		this.std = std;
	}

	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	/**
	 * @return the subjects
	 */
	public List<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

}
