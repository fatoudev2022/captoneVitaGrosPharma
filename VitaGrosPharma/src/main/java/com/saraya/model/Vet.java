package com.saraya.model;

public class Vet {
	private String firstName;
	private String lastName;
	private Specialty specialty;
	
	
	
	public Vet(String firstName, String lastName, Specialty specialty) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialty = specialty;
	}
	public Vet() {
		
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
	public Specialty getSpecialty() {
		return specialty;
	}
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	
	
	

	@Override
	public String toString() {
		return "Vet [firstName=" + firstName + ", lastName=" + lastName + ", specialty=" + specialty + "]";
	}
	
    
}
