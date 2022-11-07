package com.ref.javaclass.example;

public class Address {
	private String street;
	private String city;
	private String country;
	
	Address(String streetParam, String cityParam, String countryParam) {
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
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + ", getStreet()=" + getStreet()
				+ ", getCity()=" + getCity() + ", getCountry()=" + getCountry() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
