package com.ref.javaclass.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private String name;
	private Medium medium;

	@Override
	public String toString() {
		
		String sectionStr = "";
		
		for(Section str: sections) {
			sectionStr = sectionStr.concat(str.getName() + ",");
		}
		return "Subject [" + (name != null ? "name=" + name + ", " : "")
				+ (medium != null ? "medium=" + medium + ", " : "") + ((sections != null && sections.size() > 0) ?( "sections=" + sectionStr): "")
				+ "]";
	}

	public Subject(String nameParam, Medium mediumParam) {
		

		this.setName(nameParam);
		this.setMedium(mediumParam);

	}

	private List<Section> sections = new ArrayList();

	public Subject() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the sections
	 */
	public List<Section> getSections() {
		return sections;
	}

	/**
	 * @param sections the sections to set
	 */
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	/**
	 * @return the medium
	 */
	public Medium getMedium() {
		return medium;
	}

	/**
	 * @param medium the medium to set
	 */
	public void setMedium(Medium medium) {
		this.medium = medium;
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

}
