package com.in28minutes.oops.level2;

public class Address {

	// state
	private String line1;
	private String city;
	private String zipCode;

	// creation
	public Address(String line1, String city, String zipCode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zipCode = zipCode;
	}

	public void modifyAddress(String line1, String city, String zipCode) {
		this.line1 = line1;
		this.city = city;
		this.zipCode = zipCode;
	}


	@Override
	public String toString() {
		// return line1 + " " + city + " " + zipCode;

		// or
		return String.format("line1 - %s, city - %s, zipCode - %s", line1, city, zipCode);
	}
}
