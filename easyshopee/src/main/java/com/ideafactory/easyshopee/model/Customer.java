package com.ideafactory.easyshopee.model;

import java.util.Date;

public class Customer {
	
	private String customerId;
	private String firstName;
	private String lastName;
	private String city;
	private String postalCode;
	private String latitude;
	private String longitude;
	private Date registarionDate;
	
	
	public Date getRegistarionDate() {
		return registarionDate;
	}
	public void setRegistarionDate(Date registarionDate) {
		this.registarionDate = registarionDate;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
