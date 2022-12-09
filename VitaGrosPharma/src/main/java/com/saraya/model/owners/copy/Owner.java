package com.saraya.model.owners.copy;

import javax.validation.constraints.Size;

public class Owner {
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	@Size(min=2, message="enter at least 2 digits")
	private String city;
	private String telephone;
	private Pet pets;
	public Owner(int id, String firstName, String lastName, String address, String city, String telephone, Pet pets) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pets = pets;
	}
	
	
	public Owner() {
		super();
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Pet getPets() {
		return pets;
	}
	public void setPets(Pet pets) {
		this.pets = pets;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Owner [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", telephone=" + telephone + ", pets=" + pets + "]";
	}
	
	
	
	
	
	

}
