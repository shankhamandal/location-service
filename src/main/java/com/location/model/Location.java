package com.location.model;

public class Location {

	private String city;

	private long zipCode;

	private String street;

	private int port;

	public Location(String city, long zipCode, String street, int port) {
		super();
		this.city = city;
		this.zipCode = zipCode;
		this.street = street;
		this.port = port;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
