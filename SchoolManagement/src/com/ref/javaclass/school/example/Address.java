package com.ref.javaclass.school.example;

public class Address {
	private String street;
	private String city;
	private String country;
	
	public Address(String streetParam, String cityParam, String countryParam) {
		this.street = streetParam;
		this.city = cityParam;
		this.country = countryParam;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [" + (street != null ? "street=" + street + ", " : "")
				+ (city != null ? "city=" + city + ", " : "") + (country != null ? "country=" + country : "") + "]";
	}
	
	
}
