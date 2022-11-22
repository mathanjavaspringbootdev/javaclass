package com.ref.javaclass.example;

public class Standard {

	private String name;
	private Medium medium;
	
	public Standard(String nameParam, Medium mediumParam) {
		this.name = nameParam;
		this.medium = mediumParam;
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
	 * @return the medium
	 */
	public Medium getMedium() {
		return medium;
	}
	@Override
	public String toString() {
		return "Standard [" + (name != null ? "name=" + name + ", " : "") + (medium != null ? "medium=" + medium : "")
				+ "]";
	}
	/**
	 * @param medium the medium to set
	 */
	public void setMedium(Medium medium) {
		this.medium = medium;
	}

}
